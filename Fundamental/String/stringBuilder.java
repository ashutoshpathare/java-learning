package Fundamental.String;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert
        sb.insert(0, 's');
        System.out.println(sb);

        sb.insert(3, 'n');
        System.out.println(sb);
        
        //delete the extra n
        sb.delete(3, 4);
        System.out.println(sb);

        StringBuilder as = new StringBuilder("H");
        as.append("e");
        as.append("l");
        as.append("l");
        as.append("o");
        System.out.println(as);
        System.out.println(as.length());
    }
}
