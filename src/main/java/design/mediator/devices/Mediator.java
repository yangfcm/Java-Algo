package design.mediator.devices;

import java.util.HashMap;

public class Mediator extends AbsMediator {
  private HashMap<String, Colleague> colleagueMap;
  private HashMap<String, String> interMap;

  public Mediator() {
    colleagueMap = new HashMap<String, Colleague>();
    interMap = new HashMap<String, String>();
  }

  @Override
  public void register(String colleagueName, Colleague colleague) {
    colleagueMap.put(colleagueName, colleague);
    if (colleague instanceof Alarm) {
      interMap.put("Alarm", colleagueName);
    } else if (colleague instanceof Light) {
      interMap.put("Light", colleagueName);
    } else if (colleague instanceof Screen) {
      interMap.put("Screen", colleagueName);
    } else if (colleague instanceof Player) {
      interMap.put("Player", colleagueName);
    }
  }

  @Override
  public void getMessage(int stateChange, String colleagueName) {
    if (colleagueMap.get(colleagueName) instanceof Alarm) {
      if (stateChange == 0) {
        ((Light) (colleagueMap.get(interMap.get("Light")))).turnOn();
        ((Player) (colleagueMap.get(interMap.get("Player")))).turnOn();
      } else {
        ((Player) (colleagueMap.get(interMap.get("Player")))).turnOff();
      }
    } else if (colleagueMap.get(colleagueName) instanceof Light) {
      ((Screen) (colleagueMap.get(interMap.get("Screen")))).ready();
    } else if (colleagueMap.get(colleagueName) instanceof Screen) {
      // Other behaviour
    } else if (colleagueMap.get(colleagueName) instanceof Player) {
      // Other behaviour
    }
  }

  @Override
  public void sendMessage() {
  }
}
