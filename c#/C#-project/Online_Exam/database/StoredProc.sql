USE [oes]
GO
/****** Object:  StoredProcedure [dbo].[teacher_search_examResult_list_show]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[teacher_search_examResult_list_show]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[teacher_search_examResult_list_show]
	-- Add the parameters for the stored procedure here
	@pageSize INT,
    @offSet INT,
    @orderName NVARCHAR(160),
    @orderWay NVARCHAR(160),
    @keyWord NVARCHAR(20)
AS
   DECLARE @sql1 NVARCHAR(3000)
  
   DECLARE @pageSizeStr NVARCHAR(100)
   SET @pageSizeStr = @pageSize
  
   DECLARE @offSetStr NVARCHAR(100)
   SET @offSetStr = @offSet
BEGIN
	IF @orderWay = ''DESC''
	BEGIN
	SET @sql1 = ''SELECT TOP '' + @pageSizeStr + '' id, name, exam_number, effective_time, que_quantity, average_acore, examinee_count, number_qualified, pass_rate FROM exam e WHERE (e.id NOT IN(SELECT TOP '' + @offSetStr + ''id FROM exam e1 ORDER BY '' + @orderName + '' DESC)) AND e.name LIKE ''''%'' + @keyWord + ''%'''' ORDER BY '' + @orderName + '' DESC''
	END
	ELSE IF @orderWay = ''ASC''
	BEGIN
	SET @sql1 = ''SELECT TOP '' + @pageSizeStr + '' id, name, exam_number, effective_time, que_quantity, average_acore, examinee_count, number_qualified, pass_rate FROM exam e WHERE (e.id NOT IN(SELECT TOP '' + @offSetStr + ''id FROM exam e1 ORDER BY '' + @orderName + '' ASC)) AND e.name LIKE ''''%'' + @keyWord + ''%'''' ORDER BY '' + @orderName + '' ASC''
    END
EXEC (@sql1)
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[teacher_search_exam_total_count]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[teacher_search_exam_total_count]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[teacher_search_exam_total_count]
	-- Add the parameters for the stored procedure here
	@keyWord NVARCHAR(16)
AS
   DECLARE @sql1 NVARCHAR(3000)
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;
	SET @sql1 = ''SELECT COUNT(id) FROM exam WHERE name LIKE ''''%'' + @keyWord + ''%''''''
print(@sql1)
EXEC (@sql1)
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[get_student_unfinished_exam]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[get_student_unfinished_exam]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[get_student_unfinished_exam]
	-- Add the parameters for the stored procedure here
    @userId INT
AS
  DECLARE @sql1 NVARCHAR(3000)
  
  DECLARE @userIdStr NVARCHAR(100)
  SET @userIdStr = @userId
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SET @sql1 = ''SELECT id, exam_number, subject_name, name, single_question_score, que_quantity, effective_time, sum_score, pass_criteria, description, s.finish_time, create_time, edit_time, duration, create_ctt_name, pass_probability, user_id, exa_id, score, s.finish_time, exe_kind, operations, score_individure_total FROM exam e INNER JOIN user_score_exam s ON e.id = s.exa_id WHERE s.user_id = '' + @userIdStr + '' AND exe_kind = ''''UnFinished''''''
	EXEC (@sql1) 
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[exam_list_show]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[exam_list_show]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE  [dbo].[exam_list_show]
    @pageSize INT,
    @offSet INT,
    @userId INT,
    @kindExam VARCHAR(160),
    @orderName NVARCHAR(160),
    @orderWay NVARCHAR(160)
AS
  DECLARE @sql1 NVARCHAR(3000)
  
  DECLARE @pageSizeStr NVARCHAR(100)
  SET @pageSizeStr = @pageSize
  
  DECLARE @offSetStr NVARCHAR(100)
  SET @offSetStr = @offSet
  
  DECLARE @userIdStr NVARCHAR(100)
  SET @userIdStr = @userId
BEGIN
IF @orderWay = ''DESC''
BEGIN
    IF @kindExam = ''All''
    BEGIN
    SET @sql1 = ''SELECT TOP '' + @pageSizeStr + '' id, exam_number, subject_name, name, single_question_score, que_quantity, effective_time, sum_score, pass_criteria, description, s.finish_time, create_time, edit_time, duration, create_ctt_name, pass_probability, user_id, exa_id, score, s.finish_time, exe_kind, operations, score_individure_total FROM exam e INNER JOIN user_score_exam s ON e.id = s.exa_id WHERE (e.id NOT IN(SELECT TOP '' + @offSetStr + ''id FROM (exam e1 INNER JOIN user_score_exam s1 ON e1.id = s1.exa_id) ORDER BY '' + @orderName + '' DESC)) AND s.user_id = '' + @userIdStr + '' ORDER BY '' + @orderName + '' DESC''
    END
    ELSE
    BEGIN
	SET @sql1 = ''SELECT TOP '' + @pageSizeStr + '' id, exam_number, subject_name, name, single_question_score, que_quantity, effective_time, sum_score, pass_criteria, description, s.finish_time, create_time, edit_time, duration, create_ctt_name, pass_probability, user_id, exa_id, score, s.finish_time, exe_kind, operations, score_individure_total FROM exam e INNER JOIN user_score_exam s ON e.id = s.exa_id WHERE (e.id NOT IN(SELECT TOP '' + @offSetStr + ''id FROM (exam e1 INNER JOIN user_score_exam s1 ON e1.id = s1.exa_id) WHERE exe_kind = '''''' + @kindExam + '''''' ORDER BY '' + @orderName + '' DESC)) AND s.user_id = '' + @userIdStr + ''AND exe_kind = '''''' + @kindExam + '''''' ORDER BY '' + @orderName + '' DESC''
	END
END
ELSE IF @orderWay = ''ASC''
BEGIN
	IF @kindExam = ''All''
    BEGIN
    SET @sql1 = ''SELECT TOP '' + @pageSizeStr + '' id, exam_number, subject_name, name, single_question_score, que_quantity, effective_time, sum_score, pass_criteria, description, s.finish_time, create_time, edit_time, duration, create_ctt_name, pass_probability, user_id, exa_id, score, s.finish_time, exe_kind, operations, score_individure_total FROM exam e INNER JOIN user_score_exam s ON e.id = s.exa_id WHERE (e.id NOT IN(SELECT TOP '' + @offSetStr + ''id FROM (exam e1 INNER JOIN user_score_exam s1 ON e1.id = s1.exa_id) ORDER BY '' + @orderName + '' ASC)) AND s.user_id = '' + @userIdStr + '' ORDER BY '' + @orderName + '' ASC''
    END
    ELSE
    BEGIN
	SET @sql1 = ''SELECT TOP '' + @pageSizeStr + '' id, exam_number, subject_name, name, single_question_score, que_quantity, effective_time, sum_score, pass_criteria, description, s.finish_time, create_time, edit_time, duration, create_ctt_name, pass_probability, user_id, exa_id, score, s.finish_time, exe_kind, operations, score_individure_total FROM exam e INNER JOIN user_score_exam s ON e.id = s.exa_id WHERE (e.id NOT IN(SELECT TOP '' + @offSetStr + ''id FROM (exam e1 INNER JOIN user_score_exam s1 ON e1.id = s1.exa_id) WHERE exe_kind = '''''' + @kindExam + '''''' ORDER BY '' + @orderName + '' ASC)) AND s.user_id = '' + @userIdStr + ''AND exe_kind = '''''' + @kindExam + '''''' ORDER BY '' + @orderName + '' ASC''
	END
END
EXEC (@sql1) 
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[add_users_score]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[add_users_score]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[add_users_score]
	-- Add the parameters for the stored procedure here
	@score NVARCHAR(3),
	@finishTime NVARCHAR(20),
	@examKind NVARCHAR(15),
	@userId INT,
	@examId INT
AS
BEGIN
    INSERT user_score_exam(score, finish_time, [user_id], exa_id)  VALUES(@score, @finishTime, @userId, @examId)
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[add_exam_record]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[add_exam_record]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[add_exam_record] 
@examId INT,
@userId INT,
@queId INT,
@userAnswer NVARCHAR(1)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
        INSERT INTO exam_record(exa_id, [user_id], que_id, user_answer) VALUES((@examId), (@userId), (@queId), (@userAnswer));
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[updateLastLoginTime]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[updateLastLoginTime]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[updateLastLoginTime]
	-- Add the parameters for the stored procedure here
	@userId INT,
	@isLogined NVARCHAR(20),
	@loginTime DATETIME
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	UPDATE [user] SET last_login_time = @loginTime , is_logined = @isLogined WHERE id = @userId 
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[update_user_score_exam]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[update_user_score_exam]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'CREATE PROCEDURE [dbo].[update_user_score_exam]
	-- Add the parameters for the stored procedure here
	@userId INT,
	@examId INT,
	@finishTime NVARCHAR(20),
	@examKind NVARCHAR(20),
	@operations NVARCHAR(20),
	@score NVARCHAR(20),
	@scoreIndividureTotal NVARCHAR(20)
	
AS
BEGIN
    -- Insert statements for procedure here
	UPDATE user_score_exam SET finish_time = @finishTime , exe_kind = @examKind, operations = @operations, score_individure_total = @scoreIndividureTotal, score = @score WHERE user_id = @userId AND exa_id = @examId 
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[update_user_finish_time]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[update_user_finish_time]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[update_user_finish_time] 
	-- Add the parameters for the stored procedure here
	@finishTime NVARCHAR(20),
	@userId INT,
	@examId INT
AS
BEGIN

    -- Insert statements for procedure here
	UPDATE user_score_exam SET finish_time = @finishTime WHERE user_id = @userId AND exa_id = @examId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[update_exam_record]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[update_exam_record]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'CREATE PROCEDURE [dbo].[update_exam_record]
	@userId INT,
	@examId INT,
	@questionsId INT,
	@rightAnswer NVARCHAR(10),
	@questionStaus NVARCHAR(10)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
    -- Insert statements for procedure here
	UPDATE exam_record SET que_status = @questionStaus, right_answer = @rightAnswer WHERE user_id = @userId AND exa_id = @examId AND que_id = @questionsId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[update_exam_information]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[update_exam_information]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[update_exam_information]
	-- Add the parameters for the stored procedure here
	@examId INT,
	@numberQualified VARCHAR(20),
	@averageScore VARCHAR(20),
	@passRate VARCHAR(20)
AS
BEGIN
	
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	UPDATE exam SET average_acore = @averageScore, number_qualified = @numberQualified, pass_rate = @passRate WHERE id = @examId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[get_examinee_count]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[get_examinee_count]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[get_examinee_count]
	-- Add the parameters for the stored procedure here
	@examId INT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT examinee_count FROM exam WHERE id = @examId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[get_exam_average_score]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[get_exam_average_score]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[get_exam_average_score]
	-- Add the parameters for the stored procedure here
	@examId INT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT AVG(convert(INT, score)) FROM user_score_exam WHERE score != ''-'' AND exa_id = @examId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[get_count_of_passing_Exam]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[get_count_of_passing_Exam]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[get_count_of_passing_Exam]
	@examId INT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT COUNT(operations) FROM user_score_exam WHERE operations = ''Pass'' AND exa_id = @examId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[get_count_of_do_exam]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[get_count_of_do_exam]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[get_count_of_do_exam]
	-- Add the parameters for the stored procedure here
	@examId INT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT COUNT(operations) FROM user_score_exam WHERE operations = ''Do it'' AND exa_id = @examId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[findUserByName]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[findUserByName]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[findUserByName] 
	-- Add the parameters for the stored procedure here
	@userName NVARCHAR(25)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT id, user_name, chinese_name, password, user_number, user_phone, user_email, user_gender, user_photo, create_time, update_time, last_login_time, is_delete, is_logined FROM [user] WHERE user_name = @userName
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[find_user_score_record]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[find_user_score_record]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[find_user_score_record]
	@userId INT,
	@examId INT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT user_id, exa_id, score, finish_time, exe_kind, operations, score_individure_total FROM user_score_exam WHERE user_id = @userId AND exa_id = @examId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[find_user_questions_record]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[find_user_questions_record]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[find_user_questions_record] 
	@userId INT,
	@examId INT
AS
BEGIN
	SET NOCOUNT ON;

    SELECT id, exa_id, user_id, que_id, user_answer, que_status, right_answer FROM exam_record WHERE user_id = @userId AND exa_id = @examId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[find_role_by_user_id]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[find_role_by_user_id]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'CREATE PROCEDURE [dbo].[find_role_by_user_id]
	-- Add the parameters for the stored procedure here
	@userId INT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT role_id, user_id, name FROM user_role u INNER JOIN role r ON u.role_id = r.id WHERE [user_id] = @userId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[find_questions_by_id]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[find_questions_by_id]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[find_questions_by_id]
	@questionsId INT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;
	SELECT id, id_number, que_score, que_title, que_a_content, que_b_content, que_c_content, que_d_content, que_answer, que_create_time, que_edit_time, cont_sys_id, description from questions WHERE id = @questionsId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[find_questions_by_exam_id]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[find_questions_by_exam_id]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[find_questions_by_exam_id] 
	-- Add the parameters for the stored procedure here
	@examId INT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;
	SELECT questions_id  FROM exam_questions WHERE exam_id = @examId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[find_questions_answer]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[find_questions_answer]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE PROCEDURE [dbo].[find_questions_answer]
	@examId INT,
	@questionsId INT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT questions_id, exam_id, questions_score, questions_answer FROM exam_questions WHERE exam_id = @examId AND questions_id = @questionsId
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[exam_total_count]    Script Date: 09/06/2017 10:05:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[exam_total_count]') AND type in (N'P', N'PC'))
BEGIN
EXEC dbo.sp_executesql @statement = N'-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[exam_total_count] 
@userId INT,
@kindExam NVarchar(16)
AS 
IF @kindExam = ''All''
BEGIN
	SET NOCOUNT ON;
    SELECT COUNT(id) FROM exam e INNER JOIN user_score_exam s ON e.id = s.exa_id  WHERE s.user_id = @userId;
END
ELSE IF @kindExam = ''Finished''
BEGIN
	SET NOCOUNT ON;
    SELECT COUNT(id) FROM exam e INNER JOIN user_score_exam s ON e.id = s.exa_id WHERE s.user_id = @userId AND exe_kind = @kindExam;
END
ElSE IF @kindExam = ''UnFinished''
BEGIN
SET NOCOUNT ON;
    SELECT COUNT(id) FROM exam e INNER JOIN user_score_exam s ON e.id = s.exa_id WHERE s.user_id = @userId AND exe_kind = @kindExam;
END
' 
END
GO
