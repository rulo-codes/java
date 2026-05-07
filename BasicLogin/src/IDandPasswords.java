import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {
        logininfo.put("Bro", "pizza");
        logininfo.put("Cecil", "ineedyou");
        logininfo.put("Mark", "imadeasteak");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
