from python.Note import Note
from python.DataBase import DataBase
from datetime import datetime

db: DataBase = DataBase()


def add_note(info):
    global db
    title, body = info
    note: Note = Note(find_unsigned_id(db.note_table), title, body, datetime.now(), datetime.now())
    db.append_note(note)
    return "Создание успешно"


def delete_note(page, note):
    db.remove_note(db.select_note(page, note))
    return "Удаление успешно"


def edit_note(page, note, edit):
    db.edit_note(page, note, edit)
    return "Изменение успешно"


def get_page(page):
    message = f'Страница {page + 1}\n{db.select_page(page)}'
    return message


def get_note(page, note):
    output: str = ""
    output += f'{db.select_note(page, note)}'
    return output


def find_unsigned_id(table):
    id_list = []
    for i in table:
        id_list.append(i.note_id)
    unsigned_id = 0
    while unsigned_id in id_list:
        unsigned_id += 1
    return unsigned_id


def end_work():
    return exit()
