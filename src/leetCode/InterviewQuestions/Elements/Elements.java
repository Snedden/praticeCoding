package leetCode.InterviewQuestions.Elements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Elements {
  public static boolean isElements(String string) {
    switch (string.length()) {
      case 0:
        return true;
      case 1:
        return isElement(string.charAt(0));
      default:
        return (isElement(string.charAt(0), string.charAt(1)) && isElements(string.substring(2)))
               || (isElement(string.charAt(0)) && isElements(string.substring(1)));
    }
  }



  public static Set<String> elements = new HashSet<>(Arrays.asList(
      "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S",
      "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga",
      "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd",
      "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm",
      "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os",
      "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa",
      "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg",
      "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og"));
  public static boolean isElement(char first, char second) {
    return elements.contains(Character.toString(Character.toUpperCase(first))
                             + Character.toString(Character.toLowerCase(second)));
  }
  public static boolean isElement(char first) {
    return elements.contains(Character.toString(Character.toUpperCase(first)));
  }

}
