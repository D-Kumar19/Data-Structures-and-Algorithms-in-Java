package CodingChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentVolunteerAttendance {
    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly", "Tony", "Harry");
        Map<String, List<String>> attendeesMapping =
                Map.of("Farmer's Market", List.of("Sally", "Polly"),
                        "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                        "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                        "Midnight Breakfast", List.of("Polly", "Molly"));

        Map<String, Integer> totalAttendance = findAttendance(students,  attendeesMapping);
        List<String> lessThan2Presents = studentsWithLessThan3Attendance(totalAttendance);
        System.out.println("Students with Less than 2 Attendance at Volunteering camps are: " + lessThan2Presents);
    }

    public static Map<String, Integer> findAttendance(List<String> students, Map<String, List<String>> attendeesMapping){
//        Using Map with Loops:
//        Map<String, Integer> totalAttendance = new HashMap<>();
//
//        for(String s: students) totalAttendance.put(s, 0);
//        for(String s: attendeesMapping.keySet()){
//            List<String> studentsList = attendeesMapping.get(s);
//            for(String studentName : studentsList){
//                totalAttendance.put(studentName, totalAttendance.getOrDefault(studentName, 0) + 1);
//            }
//        }
//        return totalAttendance;

//        Using Map with Streams:
        Map<String, Integer> totalAttendance = students.stream().collect(Collectors.toMap(s -> s, n -> 0));
        attendeesMapping.values()
                .forEach(list -> list.stream()
                        .filter(totalAttendance::containsKey)
                        .forEach(filteredStudents -> totalAttendance.put(
                                filteredStudents, totalAttendance.getOrDefault(filteredStudents, 0) + 1)));
        return totalAttendance;
    }

    public static List<String> studentsWithLessThan3Attendance(Map<String, Integer> totalAttendance){
//        Using Loops:
//        List<String> lessThan2Absents = new ArrayList<>();
//        for(String s : totalAttendance.keySet()) {
//            if (totalAttendance.get(s) < 2) lessThan2Absents.add(s);
//        }
//        return lessThan2Absents;

//        Using Streams:
        return totalAttendance
                .entrySet()
                .stream()
                .filter(map -> map.getValue() < 2)
                .map(Map.Entry::getKey)
                .toList();
    }
}