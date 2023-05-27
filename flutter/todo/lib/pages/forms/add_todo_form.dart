import 'package:ap1401_flutter_tutorial/models/todo.dart';
import 'package:ap1401_flutter_tutorial/models/todo_type.dart';
import 'package:flutter/material.dart';

class AddTodoForm extends StatefulWidget {
  const AddTodoForm({Key? key, required this.length}) : super(key: key);

  final int length;

  @override
  AddTodoFormState createState() {
    return AddTodoFormState();
  }
}

class AddTodoFormState extends State<AddTodoForm> {
  final _formKey = GlobalKey<FormState>();
  final _titleController = TextEditingController();
  final _descriptionController = TextEditingController();
  TodoType _todoType = TodoType.normal;

  @override
  Widget build(BuildContext context) {
    final _spacer = SizedBox(height: 20);
    return Scaffold(
      appBar: AppBar(
        title: Text('Add Todo Form'),
      ),
      body: Form(
        key: _formKey,
        child: Center(
          child: Column(
            // crossAxisAlignment: CrossAxisAlignment.center,
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              TextFormField(
                controller: _titleController,
                decoration: InputDecoration(
                  labelText: 'Title',
                ),
                validator: (value) {
                  if (value == null || value.isEmpty || value.length < 4) {
                    return 'Please enter valid text';
                  }
                  return null;
                },
              ),
              _spacer,
              TextFormField(
                controller: _descriptionController,
                decoration: InputDecoration(
                  labelText: 'Description',
                ),
                validator: (value) {
                  if (value != null && !RegExp(r'\d+').hasMatch(value)) {
                    return 'Description must have number';
                  }
                  return null;
                },
              ),
              _spacer,
              DropdownButtonFormField<TodoType>(
                items: TodoType.values
                    .map(
                      (TodoType e) => DropdownMenuItem<TodoType>(
                        child: Text(getTodoTypeString(e)),
                        value: e,
                      ),
                    )
                    .toList(),
                onChanged: (value) {
                  if (value != null) {
                    setState(() {
                      _todoType = value;
                    });
                  }
                },
                value: _todoType,
              ),
              _spacer,
              submitButton(context),
            ],
          ),
        ),
      ),
    );
  }

  Widget submitButton(BuildContext context) {
    return ElevatedButton(
      onPressed: () {
        if (_formKey.currentState!.validate()) {
          ScaffoldMessenger.of(context).showSnackBar(
            const SnackBar(
              content: Text('Data added'),
            ),
          );
          Navigator.of(context).pop(
            Todo(
              title: _titleController.text,
              description: _descriptionController.text,
              id: widget.length + 1,
              type: _todoType,
              createdAt: DateTime.now(),
            ),
          );
        }
      },
      child: const Text('Submit'),
    );
  }

  String getTodoTypeString(TodoType todoType) {
    return _todoTypeToStringMap[todoType]!;
  }
}

const _todoTypeToStringMap = <TodoType, String>{
  TodoType.normal: 'Normal',
  TodoType.notImportant: 'Not Important',
  TodoType.veryEmergency: 'Very Emergency',
};
