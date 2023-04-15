import 'dart:io';

class convertType {
  static Map qwertyToColemak = {
    "e": "f",
    "r": "p",
    "t": "g",
    "y": "j",
    "u": "l",
    "i": "u",
    "o": "y",
    "p": ";",
    "s": "r",
    "d": "s",
    "f": "t",
    "g": "d",
    "j": "n",
    "k": "e",
    "l": "i",
    ";": "o",
    "n": "k",
  };
  static Map qwertyToDvorak = {
    "q": "'",
    "w": ",",
    "e": ".",
    "r": "p",
    "t": "y",
    "y": "f",
    "u": "g",
    "i": "c",
    "o": "r",
    "p": "l",
    "s": "o",
    "d": "e",
    "f": "u",
    "g": "i",
    "h": "d",
    "j": "h",
    "k": "t",
    "l": "n",
    ";": "s",
    "z": ";",
    "x": "q",
    "c": "j",
    "v": "k",
    "b": "x",
    "n": "b",
    ",": "w",
    ".": "v",
    "/": "z",
  };
  static Map qwertyToQwertz = {"y": "z", "z": "y"};
}

// mitonin tabe ham ezafe konin
int findConvertion (List list) {
  if (list[0] == 'qwerty')
  {
    if (list[2] == 'colemak')
      return 1;
    if (list[2] == 'dvorak')
      return 2;
    if (list[2] == 'qwertz')
      return 3;
  }
  if (list[2] == 'qwerty')
  {
    if (list[0] == 'colemak')
      return 4;
    if (list[0] == 'dvorak')
      return 5;
    if (list[0] == 'qwertz')
      return 6;
  }
  return 7;  
}
void convert(currentKey,mapKey,mapValue) {
  if (currentKey == mapKey)
    print(mapValue);
}
void main() {
  
  String? layouts=stdin.readLineSync();
  List tempParams = layouts!.split(' ');


  switch (findConvertion(tempParams)) {
    case 1: {

      String? input=stdin.readLineSync();
      String str="a";
      if (input != null)
      str = input;

      for (int i =0 ; i < str.length ; i++)
      {
        if (convertType.qwertyToColemak[str[i]] != null)
          stdout.write(convertType.qwertyToColemak[str[i]]);
        else
          stdout.write(str[i]);
      }
    }
    break;
    case 2: {
      String? input=stdin.readLineSync();
      String str="a";
      if (input != null)
      str = input;

      for (int i =0 ; i < str.length ; i++)
      {
        if (convertType.qwertyToDvorak[str[i]] != null)
          stdout.write(convertType.qwertyToColemak[str[i]]);
        else
          stdout.write(str[i]);
      }
    }
    break;
    case 3: {
      String? input=stdin.readLineSync();
      String str="a";
      if (input != null)
      str = input;

      for (int i =0 ; i < str.length ; i++)
      {
        if (convertType.qwertyToQwertz[str[i]] != null)
          stdout.write(convertType.qwertyToColemak[str[i]]);
        else
          stdout.write(str[i]);
      }
    }
    break;
    case 4: {

      String? input=stdin.readLineSync();
      String str="a";
      if (input != null)
      str = input;

      for (int i =0 ; i < str.length ; i++)
      {
        var key = convertType.qwertyToColemak.keys.firstWhere(
        (k) => convertType.qwertyToColemak[k] == str[i], orElse: () => null);

        if (key != null)
          stdout.write(key);
        else
          stdout.write(str[i]);
      }
    }
    break;
    case 5: {
      String? input=stdin.readLineSync();
      String str="a";
      if (input != null)
      str = input;

      for (int i =0 ; i < str.length ; i++)
      {
        
        var key = convertType.qwertyToDvorak.keys.firstWhere(
        (k) => convertType.qwertyToDvorak[k] == str[i], orElse: () => null);

        if (key != null)
          stdout.write(key);
        else
          stdout.write(str[i]);
      }
    }
    break;
    case 6: {
      String? input=stdin.readLineSync();
      String str="a";
      if (input != null)
      str = input;

      for (int i =0 ; i < str.length ; i++)
      {
        
        var key = convertType.qwertyToQwertz.keys.firstWhere(
        (k) => convertType.qwertyToQwertz[k] == str[i], orElse: () => null);

        if (key != null)
          stdout.write(key);
        else
          stdout.write(str[i]);
      }
    }
    break;
    default: print ("Impossible");
    break;
  }

  //var key = convertType.qwertyToQwertz.keys.firstWhere(
  //  (k) => convertType.qwertyToQwertz[k] == 'z', orElse: () => null);
  //  Map student = {'name':'Tom','age': 23};   
  //  student.forEach((k,v) => f("name", k, v));   

} 