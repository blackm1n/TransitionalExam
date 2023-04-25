import python.view as v
import python.module as m


def start():
    functions = [add_note, read_note, end]
    return functions[v.show_menu() - 1]()


def add_note():
    v.info(m.add_note(v.input_note()))


def read_note():
    page = 0
    note = v.read_note(m.get_page(page))
    while note != 8:
        if note <= 5:
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
