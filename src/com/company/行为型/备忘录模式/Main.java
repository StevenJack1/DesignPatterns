package com.company.��Ϊ��.����¼ģʽ;

public class Main {

    public static void main(String[] args) {
        //��սboosǰ
        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.show();

        // �������
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        // ��սboss
        gameRole.fight();
        gameRole.show();

        // ��ȡ����
        gameRole.recovery(roleStateCaretaker.getRoleStateMemento());
        gameRole.show();

    }
}
