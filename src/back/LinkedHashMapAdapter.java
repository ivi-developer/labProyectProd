package back;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAdapter implements JsonSerializer<LinkedHashMap<?, ?>>, JsonDeserializer<LinkedHashMap<?, ?>> {
    @Override
    public JsonElement serialize(LinkedHashMap<?, ?> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<?, ?> entry : src.entrySet()) {
            jsonObject.add(entry.getKey().toString(), context.serialize(entry.getValue()));
        }
        return jsonObject;
    }

    @Override
    public LinkedHashMap<?, ?> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
        JsonObject jsonObject = json.getAsJsonObject();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            try {
                LogrosTitle key = LogrosTitle.valueOf(entry.getKey());
                Logro value = context.deserialize(entry.getValue(), Logro.class);
                map.put(key, value);
            } catch (IllegalArgumentException e) {
                throw new JsonParseException("Invalid key for LinkedHashMap: " + entry.getKey());
            }
        }
        return map;
    }
}
