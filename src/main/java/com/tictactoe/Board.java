package com.tictactoe;

public class Board { 
    private String[][] cells={{" ", " ", " "},{" ", " "," "},{" ", " "," "}};

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String BLACK = "\u001B[30m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static final String BOLD = "\u001B[1m";
    public static final String UNDERLINE = "\u001B[4m";

        public void printBoard(){
    System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.println(GREEN + "=");
    System.out.println(BOLD + BLUE+"|           |           |           |");
    System.out.println(BOLD + GREEN+"|     "+cells[0][0]+"     |     "+cells[0][1]+"     |     "+cells[0][2]+"     |");
    System.out.println(BOLD + RED+"|           |          |           |");
    System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.println(GREEN + "-");
    System.out.println(BOLD + BLUE+"|           |           |           |");
    System.out.println(BOLD + GREEN+"|     "+cells[1][0]+"     |     "+cells[1][1]+"     |     "+cells[1][2]+"     |");
    System.out.println(BOLD + RED+"|           |           |           |");
    System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.print(GREEN + "-"); System.out.print(BLUE + "-");System.out.print(YELLOW + "-");System.out.print(RED + "-");System.out.println(GREEN + "-");
    System.out.println(BOLD + BLUE+"|           |           |           |");
    System.out.println(BOLD + GREEN+"|     "+cells[2][0]+"     |     "+cells[2][1]+"     |     "+cells[2][2]+"     |");
    System.out.println(BOLD + RED+"|           |           |           |");
    System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.print(GREEN + "="); System.out.print(BLUE + "=");System.out.print(YELLOW + "=");System.out.print(RED + "=");System.out.println(GREEN + "=");
        }

        public void addMove(){

        }

        public void checkCell(){

        }
         public void checkWin(){

         }

         public void checkFullBoard(){

         }

