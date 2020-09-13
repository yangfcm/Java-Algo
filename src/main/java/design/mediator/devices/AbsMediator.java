package design.mediator.devices;

public abstract class AbsMediator {
  public abstract void register(String colleagueName, Colleague colleague);

  // 消息接收方法
  public abstract void getMessage(int stateChange, String colleagueName);

  // 消息发送方法
  public abstract void sendMessage();
}
