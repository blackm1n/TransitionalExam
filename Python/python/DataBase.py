from python.Note import Note


class DataBase:
    note_table: list[Note]

    def __init__(self) -> None:
        self.note_table = []

    def append_note(self, note: Note) -> None:
        self.note_table.append(note)
        self.sort_table()

    def sort_table(self) -> None:
        size = len(self.note_table)
        for i in range(size):
            min_index = i
            for j in range(i + 1, size):
                if self.note_table[j].note_id < self.note_table[min_index].note_id:
                    min_index = j
            self.note_table[i], self.note_table[min_index] = self.note_table[min_index], self.note_table[i]

    def select_page(self, page: int) -> str:
        output: str = ""

        for i in range(5):
            if i + 5 * page < len(self.note_table):
                output += f'{i + 1}. "{self.note_table[i + 5 * page].title}"\n'

        return output

    def select_note(self, page: int, note: int) -> str:
        output: str = ""

        output += f'{self.note_table[note - 1 + 5 * page]}'

        return output
