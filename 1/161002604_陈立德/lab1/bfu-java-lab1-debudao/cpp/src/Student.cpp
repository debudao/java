#include "Student.h"
#include<iostream>
using namespace std;

void Student::calcAverScore()
{
	double sum = 0;
	double hoursum = 0;
	courseList c = report;
	while (c->next!=NULL)
	{
		c = c->next;
		sum += c->_courseHour*c->_score;
		hoursum += c->_courseHour;	
	}

	averScore = sum / hoursum;
}

Student::Student()
{
	name = "";
	NO = 0;
	averScore = 0;
	report = new course;
	report->next = NULL;
}

Student::Student(string name, int NO, double averScoer)
{
	this->name = name;
	this->NO = NO;
	this->averScore = averScoer;
	report = new course;
	report->next = NULL;
}

Student::~Student()
{
}

void Student::setName(string name)
{
	this->name = name;
}

void Student::setNO(int NO)
{
	this->NO = NO;
}

string Student::getName()
{
	return name;
}

int Student::getNO()
{
	return NO;
}

double Student::getAverScore()
{
	calcAverScore();
	return averScore;
}

bool Student::addCourse(string NO, string name, int hour, double score)
{
	courseList c = report;
	while (c->next!=NULL)
	{	
		c = c->next;
		if (c->_courseNumber == NO)
			return false;
	}

	course *l = new course;
	l->_courseNumber = NO;
	l->_courseName = name;
	l->_courseHour = hour;
	l->_score = score;
	l->next = NULL;
	c->next = l;

	return true;
}

bool Student::delCourse(string NO)
{
	courseList c = report;
	int k = 0;
	while (c->next!=NULL)
	{
		if (c->next->_courseNumber == NO)
		{
			courseList a = c->next->next;
			c->next = a;
			k = 1;
			break;
		}
		else
			c = c->next;
	}
	if (k == 0)
		return false;

	return true;
}

bool Student::updateCourse(string NO, double score)
{
	courseList c = report;
	int k = 0;
	while (c->next != NULL)
	{
		if (c->next->_courseNumber == NO)
		{
			c->next->_score = score;
			k = 1;
			break;
		}
		else
			c = c->next;
	}
	if (k == 0)
		return  false;

	return true;
}

void Student::printReport()
{
	courseList c = report;

	while (c->next != NULL)
	{
		c = c->next;
		cout << c->_courseNumber << " " << c->_courseName << " " << c->_courseHour << " " << c->_score << endl;
	}
}

void Student::printReport(string NO)
{
	courseList c = report;

	while (c->next != NULL)
	{
		if (c->next->_courseNumber == NO)
		{
			c = c->next;
			cout << c->_courseNumber << " " << c->_courseName << " " << c->_courseHour << " " << c->_score << endl;
			break;
		}
		else
			c = c->next;
	}
}


