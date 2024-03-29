IF NOT EXISTS (SELECT * FROM sys.databases WHERE name = 'oes')
BEGIN
CREATE DATABASE [oes]
END
GO
USE [oes]
GO
/****** Object:  Table [dbo].[user_score_exam]    Script Date: 09/06/2017 10:02:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[user_score_exam]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[user_score_exam](
	[user_id] [int] NULL,
	[exa_id] [int] NULL,
	[score] [varchar](3) NULL,
	[finish_time] [varchar](45) NULL,
	[exe_kind] [varchar](45) NULL,
	[operations] [nvarchar](50) NULL,
	[score_individure_total] [nvarchar](50) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[user_role]    Script Date: 09/06/2017 10:02:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[user_role]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[user_role](
	[role_id] [int] NOT NULL,
	[user_id] [int] NOT NULL
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[user]    Script Date: 09/06/2017 10:02:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[user]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[user](
	[id] [int] NOT NULL,
	[user_name] [nvarchar](25) NULL,
	[chinese_name] [nvarchar](50) NULL,
	[password] [nvarchar](50) NULL,
	[user_number] [nvarchar](50) NULL,
	[user_phone] [nvarchar](50) NULL,
	[user_email] [nvarchar](50) NULL,
	[user_gender] [nvarchar](50) NULL,
	[user_photo] [nvarchar](50) NULL,
	[create_time] [datetime] NULL,
	[update_time] [nvarchar](50) NULL,
	[last_login_time] [datetime] NULL,
	[is_delete] [nvarchar](3) NULL,
	[is_logined] [nvarchar](4) NULL
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[role]    Script Date: 09/06/2017 10:02:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[role]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[role](
	[id] [int] NULL,
	[name] [varchar](25) NULL,
	[display_name] [varchar](45) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[questions]    Script Date: 09/06/2017 10:02:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[questions]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[questions](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_number] [varchar](45) NULL,
	[que_score] [varchar](2) NULL,
	[que_title] [varchar](120) NULL,
	[que_a_content] [varchar](120) NULL,
	[que_b_content] [varchar](120) NULL,
	[que_c_content] [varchar](120) NULL,
	[que_d_content] [varchar](120) NULL,
	[que_answer] [varchar](100) NULL,
	[que_create_time] [datetime] NULL,
	[que_edit_time] [datetime] NULL,
	[cont_sys_id] [int] NULL,
	[description] [varchar](150) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[exam_record]    Script Date: 09/06/2017 10:02:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[exam_record]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[exam_record](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[exa_id] [int] NULL,
	[user_id] [int] NULL,
	[que_id] [int] NULL,
	[user_answer] [varchar](1) NULL,
	[que_status] [nvarchar](10) NULL,
	[right_answer] [nvarchar](10) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[exam_questions]    Script Date: 09/06/2017 10:02:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[exam_questions]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[exam_questions](
	[questions_id] [int] NOT NULL,
	[exam_id] [int] NOT NULL,
	[questions_score] [nvarchar](10) NULL,
	[questions_answer] [nvarchar](10) NULL
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[exam]    Script Date: 09/06/2017 10:02:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[exam]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[exam](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[exam_number] [varchar](8) NULL,
	[subject_name] [varchar](25) NULL,
	[name] [varchar](45) NULL,
	[single_question_score] [varchar](2) NULL,
	[que_quantity] [varchar](3) NULL,
	[effective_time] [datetime] NULL,
	[sum_score] [varchar](3) NULL,
	[pass_criteria] [varchar](2) NULL,
	[description] [varchar](120) NULL,
	[finish_time] [varchar](45) NULL,
	[create_time] [datetime] NULL,
	[edit_time] [datetime] NULL,
	[duration] [varchar](3) NULL,
	[create_ctt_name] [varchar](45) NULL,
	[pass_probability] [varchar](45) NULL,
	[average_acore] [varchar](50) NULL,
	[examinee_count] [varchar](50) NULL,
	[number_qualified] [varchar](50) NULL,
	[pass_rate] [varchar](50) NULL,
 CONSTRAINT [PK_exam] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Default [score_default]    Script Date: 09/06/2017 10:02:39 ******/
IF Not EXISTS (SELECT * FROM sys.default_constraints WHERE object_id = OBJECT_ID(N'[dbo].[score_default]') AND parent_object_id = OBJECT_ID(N'[dbo].[user_score_exam]'))
Begin
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[score_default]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[user_score_exam] ADD  CONSTRAINT [score_default]  DEFAULT ('-') FOR [score]
END


End
GO
