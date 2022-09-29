package com.sevenSeg.example.utils;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String number = JOptionPane.showInputDialog("Ingrese Numero");
        String firstNumber = number.split(",")[0];
        String secondNumber = number.split(",")[1];

        int numberOfRepetitions = Integer.parseInt(firstNumber);
        int digit = Integer.parseInt(secondNumber);
        int cantDigit = secondNumber.length();
        int[] arrayCifras = new int[secondNumber.length()];
        int v;
        for (v = 0; v < secondNumber.length(); v++) {
            arrayCifras[v] = Integer.parseInt(String.valueOf(secondNumber.charAt(v)));

        }

            for (int j = 0; j < numberOfRepetitions; j++) {
                String[][] displayArray = new String[secondNumber.length()][7];

                for (v = 0; v < secondNumber.length(); v++) {
                    switch (arrayCifras[v]) {
                        case 1: {
                            displayArray[v][0] = "   ";
                            displayArray[v][1] = " ";
                            displayArray[v][2] = "|";
                            displayArray[v][3] = "   ";
                            displayArray[v][4] = " ";
                            displayArray[v][5] = "|";
                            displayArray[v][6] = "   ";
                            break;
                        }
                        case 2: {
                            displayArray[v][0] = "---";
                            displayArray[v][1] = " ";
                            displayArray[v][2] = "|";
                            displayArray[v][3] = "---";
                            displayArray[v][4] = "|";
                            displayArray[v][5] = " ";
                            displayArray[v][6] = "---";
                            break;
                        }
                        case 3: {
                            displayArray[v][0] = "---";
                            displayArray[v][1] = " ";
                            displayArray[v][2] = "|";
                            displayArray[v][3] = "---";
                            displayArray[v][4] = " ";
                            displayArray[v][5] = "|";
                            displayArray[v][6] = "---";
                            break;
                        }
                        case 4: {
                            displayArray[v][0] = "   ";
                            displayArray[v][1] = "|";
                            displayArray[v][2] = "|";
                            displayArray[v][3] = "---";
                            displayArray[v][4] = " ";
                            displayArray[v][5] = "|";
                            displayArray[v][6] = "   ";
                            break;
                        }
                        case 5: {
                            displayArray[v][0] = "---";
                            displayArray[v][1] = "|";
                            displayArray[v][2] = " ";
                            displayArray[v][3] = "---";
                            displayArray[v][4] = " ";
                            displayArray[v][5] = "|";
                            displayArray[v][6] = "---";
                            break;
                        }
                        case 6: {
                            displayArray[v][0] = "   ";
                            displayArray[v][1] = "|";
                            displayArray[v][2] = " ";
                            displayArray[v][3] = "---";
                            displayArray[v][4] = "|";
                            displayArray[v][5] = "|";
                            displayArray[v][6] = "---";
                            break;
                        }
                        case 7: {
                            displayArray[v][0] = "---";
                            displayArray[v][1] = " ";
                            displayArray[v][2] = "|";
                            displayArray[v][3] = "   ";
                            displayArray[v][4] = " ";
                            displayArray[v][5] = "|";
                            displayArray[v][6] = "   ";
                            break;
                        }
                        case 8: {
                            displayArray[v][0] = "---";
                            displayArray[v][1] = "|";
                            displayArray[v][2] = "|";
                            displayArray[v][3] = "---";
                            displayArray[v][4] = "|";
                            displayArray[v][5] = "|";
                            displayArray[v][6] = "---";
                            break;
                        }
                        case 9: {
                            displayArray[v][0] = "---";
                            displayArray[v][1] = "|";
                            displayArray[v][2] = "|";
                            displayArray[v][3] = "---";
                            displayArray[v][4] = " ";
                            displayArray[v][5] = "|";
                            displayArray[v][6] = "   ";
                            break;
                        }
                    }
                }

                    if(numberOfRepetitions <= 5 || cantDigit< 3){
                        System.out.println("cantidad de digitos " +cantDigit);
                        for (v = 0; v < secondNumber.length(); v++) {
                            System.out.printf("   %s   ", displayArray[v][0]);
                        }
                        System.out.println("");
                        for (v = 0; v < secondNumber.length(); v++) {
                            System.out.printf(" %s     %s ", displayArray[v][1], displayArray[v][2]);
                        }
                        System.out.println("");
                        for (v = 0; v < secondNumber.length(); v++) {
                            System.out.printf("   %s   ", displayArray[v][3]);
                        }
                        System.out.println("");
                        for (v = 0; v < secondNumber.length(); v++) {
                            System.out.printf(" %s     %s ", displayArray[v][4], displayArray[v][5]);
                        }
                        System.out.println("");
                        for (v = 0; v < secondNumber.length(); v++) {
                            System.out.printf("   %s   ", displayArray[v][6]);
                        }
                        System.out.println("");
                    }


            }
        }


    }





