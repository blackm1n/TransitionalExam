import datetime as dt


class Note:
    note_id: int
    title: str
    body: str
    add_time: dt.datetime
    edit_time: dt.datetime

    def __init__(self, note_id: int, title: str, body: str, add_time: dt.datetime, edit_time: dt.datetime) -> None:
        self.note_id = note_id
        self.title = title
        self.body = body
        self.add_time = add_time
        self.edit_time = edit_time

    def __repr__(self) -> str:
        return f'{self.title}\n\n{self.body}'

    def export_data(self) -> dict:
        return {"note_id": self.note_id, "title": self.title, "body": self.body, "add_time": str(self.add_time), "edit_time": str(self.edit_time)}
