import python.view as v
import python.module as m


def start():
    functions = [add_note, (get_notes, 0), (get_notes, 1), (get_notes, 2), end]
    choice = functions[v.show_menu() - 1]
    if not isinstance(choice, tuple):
        return choice()
    else:
        return choice[0](choice[1])


def add_note():
    v.info(m.add_note(v.input_note()))


def get_notes(action):
    page = 0
    note = v.read_note(m.get_page(page))
    while note != 8:
        if note <= 5:
            if action == 0:
                v.info(m.delete_note(page, note))
            elif action == 1:
                v.info(m.get_note(page, note))
                v.info(m.edit_note(page, note, v.edit_note()))
            elif action == 2:
                v.info(m.get_note(page, note))
                v.pause()
        elif note == 6:
            if page != 1:
                page -= 1
        elif note == 7:
            page += 1
        note = v.read_note(m.get_page(page))


def end():
    return m.end_work()
