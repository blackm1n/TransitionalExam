import datetime as dt


class Note:
    note_id: int
    title: str
    body: str
    add_date: dt.date
    edit_date: dt.date

    def __init__(self, note_id: int, title: str, body: str, add_date: dt.date, edit_date: dt.date) -> None:
        self.note_id = note_id
        self.title = title
        self.body = body
        self.add_date = add_date
        self.edit_date = edit_date

    def __repr__(self) -> str:
        return f'{self.title}\n\n{self.body}'

    def export_data(self) -> dict:
        return {"note_id": self.note_id, "title": self.title, "body": self.body, "add_date": str(self.add_date), "edit_date": str(self.edit_date)}
