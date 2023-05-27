import 'package:ap1401_flutter_tutorial/pages/screens/todos_screen.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    const String appTitle = 'ToDo List';
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: appTitle,
      home: TodosScreen(),
    );
  }
}
