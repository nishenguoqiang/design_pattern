package cn.xxan.alin;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Day20180309 {

    public static void main(String[] args){
        String track = "{\"t_command\":0,\"t_dEditMeth\":0,\"t_dEditStatus\":0,\"t_dataDate\":\"20180308170849\",\"t_date\":\"20180308170849\",\"t_lifecycle\":3,\"t_mEditMeth\":0,\"t_mEditStatus\":0,\"t_tipStatus\":1,\"t_trackInfo\":[]}";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("track",track);
        JSONObject trackObj = jsonObject.getJSONObject("track");
        JSONArray t_trackInfo = trackObj.getJSONArray("t_trackInfo");
        if(t_trackInfo.isEmpty()){
            System.out.println("t_trackInfo为空");
        }
            System.out.println(t_trackInfo.get(0));

    }
}
