import 'package:ap1401_flutter_tutorial/models/todo_type.dart';
import 'package:ap1401_flutter_tutorial/pages/screens/todo_detail_screen.dart';
import 'package:flutter/material.dart';

import 'package:ap1401_flutter_tutorial/models/todo.dart';

class TodoView extends StatelessWidget {
  TodoView({
    required this.todo, required this.onTap,
  });
  final Todo todo;
  final VoidCallback onTap;

  @override
  Widget build(BuildContext context) {
    return ListTile(
      title: Text(todo.title),
      subtitle: Text(todo.description),
      trailing: Icon(Icons.chevron_right),
      onTap: onTap,
      tileColor: _typeToColor(todo.type),
    );
  }

  Color _typeToColor(TodoType? todoType) {
    switch (todoType) {
      case TodoType.veryEmergency:
        return Colors.redAccent;
      case TodoType.normal:
        return Colors.green;
      case TodoType.notImportant:
        return Colors.grey;
      default:
        return Colors.grey;
    }
  }
}
