public class SeperateDuplicates {

    public String SeperateDuplicateChars(String str){
        if (str == null)
            return null;

        int size = str.length();
        int[] letters = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            char baseLevel = character >= 'A' && character <= 'Z' ? 'A' : character >= 'a' && character <= 'z' ? 'a' : '\0';

            if (baseLevel == '\0')
                continue;

            int letter = str.charAt(i) - baseLevel;

            if (letters[letter] != 0)
                size++;

            letters[letter]++;
        }

        char[] arr = new char[size];

        for (int i = 0, j = 0; i < str.length(); i++, j++) {
            char character = str.charAt(i);

            if (i > 0 && arr[i - 1] == character)
                arr[j++] = '-';

            arr[j] = character;
        }

        return new String(arr);
    }
}
