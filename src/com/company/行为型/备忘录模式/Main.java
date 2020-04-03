package com.company.行为型.备忘录模式;

public class Main {

    public static void main(String[] args) {
        //大战boos前
        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.show();

        // 保存进度
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        // 大战boss
        gameRole.fight();
        gameRole.show();

        // 读取进度
        gameRole.recovery(roleStateCaretaker.getRoleStateMemento());
        gameRole.show();

    }
}
