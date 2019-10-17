package com.example.cpsc411hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.cpsc411hw2.adapter.SummaryListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected ListView mSummaryView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createStudentObjects();

        mSummaryView = findViewById(R.id.summary_list_id);
        SummaryListAdapter ad = new SummaryListAdapter();
        mSummaryView.setAdapter(ad);
    }

    protected void createStudentObjects(){
        ArrayList<Student> students = new ArrayList<Student>();

        ArrayList<CourseEnrollment> cTemp = new ArrayList<CourseEnrollment>();
        cTemp.add(new CourseEnrollment("CPSC411", "A"));
        cTemp.add(new CourseEnrollment("CPSC440", "D"));
        Student sTemp = new Student("Bob", "Ross");
        sTemp.setcList(cTemp);
        students.add(sTemp);

        cTemp = new ArrayList<CourseEnrollment>();
        cTemp.add(new CourseEnrollment("CPSC666", "A"));
        cTemp.add(new CourseEnrollment("CPSC212", "C"));
        sTemp = new Student("Brannon", "Ha");
        sTemp.setcList(cTemp);
        students.add(sTemp);

        StudentDB.getInstance().setPersonList(students);
    }
}
