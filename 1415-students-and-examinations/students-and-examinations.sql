# Write your MySQL query statement below

select st.student_id, st.student_name, sub.subject_name, 
count(ex.student_id) as attended_exams
from students st 
cross join subjects sub
left join examinations ex
on sub.subject_name = ex.subject_name
and st.student_id = ex.student_id

group by st.student_id, st.student_name, sub.subject_name
order by st.student_id, st.student_name, sub.subject_name