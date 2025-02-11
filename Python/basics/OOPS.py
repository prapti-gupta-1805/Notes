class Student:
        def __init__(self, name, house,patronus):
            if not name:
                raise ValueError("Missing Name")
            if house not in ["Gryffindor","Hufflepuff","Ravenclaw","Slytherin"]:
                raise ValueError("Invalid House")
            self.name = name
            self.house = house
            self.patronus = patronus

        def __str__(self):
            return "a student"

        def house(self);
            return self.house
        def charm(self):
            match self.patronus:
                case "Stag":
                    return "🐴"
                case "Otter":
                    return "🦦"
                case "Jack Russel Terrier":
                    return "🐶"
                case _:
                    return "🧝🏻‍♀️"

def main():
    student = get_student()
    print(f"{student.name} from {student.house}")
    print("Expecto Patronum")
    print(student.charm())
    print(student)

def get_student():
    # student = Student()
    # student.name = input("name: ")
    # student.house = input("house:  ")
    # return student

    name = input("name: ")
    house = input("house:  ")
    patronus = input("patronus:  ")

    student = Student(name,house,patronus) #constructor call
    return student

if __name__ == "__main__" :
    main()