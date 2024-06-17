package back;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class HashmapHandler<T,U> {
    private HashMap<T,U>hashMap;
    public HashmapHandler(){hashMap=new HashMap<>();}
    public HashmapHandler(HashMap<T, U> hashMap){this.hashMap = hashMap;}
    public void cargarHashmapAJson(String filePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            gson.toJson(hashMap, bufferedWriter);

        } catch (IOException e) {
            System.out.println("Error guardando: " + e.getMessage());
        }
    }
    public HashMap<T, U> getHashMap(){return hashMap;}
    public Boolean existe(T t){return hashMap.containsKey(t);}
    public void agregarElemento(T t, U u){hashMap.put(t,u);}
    public HashMap<T, U> recibirHashmapDesdeJson(String filePath,Type type) {
        Gson gson = new Gson();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            return gson.fromJson(bufferedReader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Bienvenido viajero.");
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }
        return new HashMap<>(); // Devuelve un HashMap vacío en caso de error
    }
    public U devolverValue(T t)throws RuntimeException{
        if(!hashMap.containsKey(t)){
            throw new RuntimeException("no se encontro la key");
        }
         return hashMap.get(t);
    }
    public void mostrarGenerico(){for (Map.Entry<T, U> entry : hashMap.entrySet()){System.out.println(entry.getKey()+" "+ entry.getValue());}}

}
