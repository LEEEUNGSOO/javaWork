package com.multi.object.objapp1;

public class ActionMain {
    public static void main(String[] args) {
//        LoginAtion loginAtion=new LoginAtion();
//        DeleteAction deleteAction=new DeleteAction();
//        loginAtion.execute();//라이딩한 자신메소드
//        deleteAction.execute();//선조 Action excute호출

        Action action=new LoginAtion();
        action.execute();

        action=new DeleteAction();
        action.execute();


    }
}
