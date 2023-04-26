from python.Note import Note


class DataBase:
    note_table: list[Note]

    def __init__(self) -> None:
        self.note_table = []

    def append_note(self, note: Note) -> None:
        self.note_table.append(note)
        self.sort_table()

    def remove_note(self, note: Note) -> None:
        self.note_table.remove(note)

    def sort_table(self) -> None:
        size = len(self.note_table)
        for t in range(size):
            min_time = t
            for i in range(t + 1, size):
                if self.note_table[i].edit_time > self.note_table[min_time].edit_time:
                    min_time = i
            self.note_table[t], self.note_table[min_time] = self.note_table[min_time], self.note_table[t]

    def select_page(self, page: int) -> str:
        output: str = ""

        for i in range(5):
            if i + 5 * page < len(self.note_table):
                output += f'{i + 1}. "{self.note_table[i + 5 * page].title}"\n'

        return output

    def select_note(self, page: int, note: int) -> str:
        return self.note_table[note - 1 + 5 * page]
