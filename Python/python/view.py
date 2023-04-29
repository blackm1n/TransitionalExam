def show_menu() -> int:
    print("\n" + "=" * 20)
    print("Выберите необходимое действие")
    print("1. Добавить заметку")
    print("2. Удалить заметку")
    print("3. Редактировать заметку")
    print("4. Прочитать заметку")
    print("5. Закончить работу")
    return get_int()


def input_note() -> tuple:
    print("\n" + "=" * 20)
    title: str = input("Название:\n")
    body: str = input("Введите заметку:\n")
    return title, body


def edit_note() -> str:
    body: str = input("Введите заметку:\n")
    return body


def read_note(notes) -> int:
    print("\n" + "=" * 20)
    print(notes)
    print("6. Предыдущая страница")
    print("7. Следующая страница")
    print("8. Вернуться в главное меню")
    return get_int()


def get_int() -> int:
    while True:
        try:
            num = int(input("Введите номер необходимого действия: "))
        except:
            print("Что-то пошло не так, повторите попытку")
        else:
            return num


def info(message) -> None:
    print("\n" + "=" * 20)
    print(message)


def pause() -> None:
    print("\n")
    input("Введите любое сообщение для продолжения... ")
