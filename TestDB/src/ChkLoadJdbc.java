public class ChkLoadJdbc {
public static void main(String[] args) throws InstantiationException,
IllegalAccessException {
String msg = "";
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
msg = "�h���C�o�̃��[�h�ɐ������܂���";
} catch (ClassNotFoundException e){
msg = "�h���C�o�̃��[�h�Ɏ��s���܂���";
}
System.out.println(msg);
}
}
