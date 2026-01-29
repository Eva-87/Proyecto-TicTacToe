package com.tictactoe;

public class Board {

    private String[][] cells = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };


    // Constructor

    private void drawRows(String symbol, String connector) {
        String[] colors = { Colors.RED, Colors.GREEN, Colors.BLUE, Colors.YELLOW };

    
    // Methods

        System.out.print("    ");
        for (int r = 0; r < 37; r++) {
            if (r == 12 || r == 24) {
                System.out.print(Colors.RED + connector);
            } else {
                System.out.print(colors[r % 4] + symbol);
            }
        }
        System.out.println(Colors.RESET);
    }

    public void printBoard() {
        System.out.println(Colors.CYAN + Colors.BOLD + "           A           B           C" + Colors.RESET);
        drawRows("=", "=");
        System.out.println(Colors.BOLD + Colors.BLUE + "    |           |           |           |");
        System.out.println(Colors.CYAN + Colors.BOLD + " 1  " + Colors.GREEN + "|     " + cells[0][0] + "     |     " + cells[0][1]
                + "     |     " + cells[0][2] + "     |");
        System.out.println(Colors.BOLD + Colors.RED + "    |           |           |           |");
        drawRows("-", "+");
        System.out.println(Colors.BOLD + Colors.BLUE + "    |           |           |           |");
        System.out.println(Colors.CYAN + Colors.BOLD + " 2  " + Colors.GREEN + "|     " + cells[1][0] + "     |     " + cells[1][1]
                + "     |     " + cells[1][2] + "     |");
        System.out.println(Colors.BOLD + Colors.RED + "    |           |           |           |");
        drawRows("-", "+");
        System.out.println(Colors.BOLD + Colors.BLUE + "    |           |           |           |");
        System.out.println(Colors.CYAN + Colors.BOLD + " 3  " + Colors.GREEN + "|     " + cells[2][0] + "     |     " + cells[2][1]
                + "     |     " + cells[2][2] + "     |");
        System.out.println(Colors.BOLD + Colors.RED + "    |           |           |           |");
        drawRows("=", "=");
    }

    public void addMove(int[] coordinate, String symbol) {
        cells[coordinate[0]][coordinate[1]] = symbol;
    }

    public boolean checkCell(int[] coordinate) {
        int r = coordinate[0];
        int c = coordinate[1];
        if (cells[r][c].equals(" ")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkWin(String value) {
        
        if  ((cells[0][0].equals(value) && cells[0][1].equals(value) && cells[0][2].equals(value))||
            (cells[1][0].equals(value) && cells[1][1].equals(value) && cells[1][2].equals(value))|| 
            (cells[2][0].equals(value) && cells[2][1].equals(value) && cells[2][2].equals(value))|| 
            (cells[0][0].equals(value) && cells[1][0].equals(value) && cells[2][0].equals(value))|| 
            (cells[0][1].equals(value) && cells[1][1].equals(value) && cells[2][1].equals(value))|| 
            (cells[0][2].equals(value) && cells[1][2].equals(value) && cells[2][2].equals(value))|| 
            (cells[0][0].equals(value) && cells[1][1].equals(value) && cells[2][2].equals(value))|| 
            (cells[0][2].equals(value) && cells[1][1].equals(value) && cells[2][0].equals(value))){

                return true;
        }
            else{return false;}
    }

    public boolean checkFullBoard() {
        
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) { 
                if (cells[r][c].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void resetBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                cells[r][c] = " ";
            }
        }
    }
}