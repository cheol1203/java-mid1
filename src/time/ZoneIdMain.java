package time;

import java.time.ZoneId;

public class ZoneIdMain {
    /*
    ZoneId : 타임존 정보를 가진 클래스
     */
    public static void main(String[] args) {
        for(String availableZoneId : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        //시스템이 사용하는 기본 ZoneId를 반환
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId = " + zoneId);

        //타임존을 직접 제공해서 ZoneId 반환
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
