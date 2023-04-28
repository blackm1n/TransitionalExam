from python.Note import Note
from python.DataBase import DataBase
from datetime import datetime
import json


def save_data(database):
    with open(f'data/data.json', 'w') as file:
        file.write(json.dumps(database.export_data()))


def load_data(database):
    with open(f'data/data.json', 'r') as file:
        raw_data = json.loads(file.read())

    data = raw_data.get('notes')

    for i in range(len(data)):
        data[i] = list(data[i].values())

    for note in data:
        database.append_note(Note(note[0], note[1], note[2], note[3], note[4]))


db: DataBase = DataBase()
load_data(db)


def add_note(info):
    global db
    title, body = info
    note: Note = Note(find_unsigned_id(db.note_table), title, body, datetime.now(), datetime.now())
    db.append_note(note)
    save_data(db)
    return "Создание успешно"


def delete_note(page, note):
    global db
    db.remove_note(db.select_note(page, note))
    save_data(db)
    return "Удаление успешно"


def edit_note(page, note, edit):
    global db
    db.edit_note(page, note, edit)
    save_data(db)
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
