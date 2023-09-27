package com.example.asciiart;

import javafx.scene.control.TextArea;


import java.time.LocalDate;

public class Artist {

    private String name;

    public void setName(String name) {
        this.name = name;
    }






    public String drawOwlUI (){
       return " (o,o)\n" +
               " /)( )(\\\n" +
               "   ^ ^"
               +"\n "+ " Copyright "+name+" " + LocalDate.now().getYear();


    }

    public String drawPlaneUI() {
        return "      ______\n" +
                "            _\\ _~-\\___\n" +
                " = = ==(____AA____D\n" +
                "                \\_____\\___________________,-~~~~~~~`-.._\n" +
                "                    o o o O     /          o O o o o o O O o o o o o o O o  |\\_\n" +
                "                   .......................         `~-.__              ___..----..                  )\n" +
                "                      `---~~\\___________/------------`````\n" +
                "                      =  ===(_________D" +"\n "+ " Copyright "+name+" " + LocalDate.now().getYear();
    }

        public String drawCatUI() {
            return "           ;,_            ,\n" +
                    "                 _uP~\"b          d\"u,\n" +
                    "                dP'   \"b       ,d\"  \"o\n" +
                    "               d\"    , `b     d\"'    \"b\n" +
                    "              l] [    \" `l,  d\"       lb\n" +
                    "              Ol ?     \"  \"b`\"=uoqo,_  \"l\n" +
                    "            ,dBb \"b        \"b,    `\"~~TObup,_\n" +
                    "          ,d\" (db.`\"         \"\"     \"tbc,_ `~\"Yuu,_\n" +
                    "        .d\" l`T'  '=                      ~     `\"\"Yu,\n" +
                    "      ,dO` gP,                           `u,   b,_  \"b7\n" +
                    "     d?' ,d\" l,                           `\"b,_ `~b  \"1\n" +
                    "   ,8i' dl   `l                 ,ggQOV\",dbgq,._\"  `l  lb\n" +
                    "  .df' (O,    \"             ,ggQY\"~  , @@@@@d\"bd~  `b \"1\n" +
                    " .df'   `\"           -=@QgpOY\"\"     (b  @@@@P db    `Lp\"b,\n" +
                    ".d(                  _               \"ko \"=d_,Q`  ,_  \"  \"b,\n" +
                    "Ql         .         `\"qo,._          \"tQo,_`\"\"bo ;tb,    `\"b,\n" +
                    "qQ         |L           ~\"QQQgggc,_.,dObc,opooO  `\"~~\";.   __,7,\n" +
                    "qp         t\\io,_           `~\"TOOggQV\"\"\"\"        _,dg,_ =PIQHib.\n" +
                    "`qp        `Q[\"tQQQo,_                          ,pl{QOP\"'   7AFR`\n" +
                    "  `         `tb  '\"\"tQQQg,_             p\" \"b   `       .;-.`Vl'\n" +
                    "             \"Yb      `\"tQOOo,__    _,edb    ` .__   /`/'|  |b;=;.__\n" +
                    "                           `\"tQQQOOOOP\"\"`\"\\QV;qQObob\"`-._`\\_~~-._\n" +
                    "                                \"\"\"\"    ._        /   | |oP\"\\_   ~\\ ~\\_~\\\n" +
                    "                                        `~\"\\ic,qggddOOP\"|  |  ~\\   `\\~-._\n" +
                    "                                          ,qP`\"\"\"|\"   | `\\ `;   `\\   `\\\n" +
                    "                               _        _,p\"     |    |   `\\`;    |    |\n" +
                    "                            \"boo,._dP\"       `\\_  `\\    `\\|   `\\   ;\n" +
                    "                                 `\"7tY~'            `\\  `\\    `|_   |\n" +
                    "                                                      `~\\  |"
            +"\n "+ " Copyright "+name+" " + LocalDate.now().getYear();
        }

        public  void drawUI(String art, TextArea ta){
            if (art.equalsIgnoreCase("owl")){
               String artToUI= drawOwlUI();
                ta.setText(artToUI);
            }
        else if (art.equalsIgnoreCase("cat")) {
                String artToUI= drawCatUI();
                ta.setText(artToUI);
        }
            else if (art.equalsIgnoreCase("plane")) {
                String artToUI=drawPlaneUI();
                ta.setText(artToUI);
            }

}}
