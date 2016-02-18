-- phpMyAdmin SQL Dump
-- version 4.3.6
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 18, 2016 at 01:45 PM
-- Server version: 5.6.28-0ubuntu0.15.10.1
-- PHP Version: 5.6.11-1ubuntu3.1

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ecvet_draft`
--

-- --------------------------------------------------------

--
-- Table structure for table `assessment`
--

DROP TABLE IF EXISTS `assessment`;
CREATE TABLE IF NOT EXISTS `assessment` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `METHODLIST_ID` int(11) DEFAULT NULL,
  `PROCESSLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `assessmentlist`
--

DROP TABLE IF EXISTS `assessmentlist`;
CREATE TABLE IF NOT EXISTS `assessmentlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `assessmentlist_assessment`
--

DROP TABLE IF EXISTS `assessmentlist_assessment`;
CREATE TABLE IF NOT EXISTS `assessmentlist_assessment` (
  `assessmentlist_id` int(11) NOT NULL,
  `assessment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `attachment`
--

DROP TABLE IF EXISTS `attachment`;
CREATE TABLE IF NOT EXISTS `attachment` (
  `ID` int(11) NOT NULL,
  `ATTACHMENTURL` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `IDREFTOKEN` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `certificatetemplate`
--

DROP TABLE IF EXISTS `certificatetemplate`;
CREATE TABLE IF NOT EXISTS `certificatetemplate` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `certificatetemplate_attachment`
--

DROP TABLE IF EXISTS `certificatetemplate_attachment`;
CREATE TABLE IF NOT EXISTS `certificatetemplate_attachment` (
  `attachments_id` int(11) NOT NULL,
  `attachment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `competentinstitution`
--

DROP TABLE IF EXISTS `competentinstitution`;
CREATE TABLE IF NOT EXISTS `competentinstitution` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `LEGISLATIONLIST_ID` int(11) DEFAULT NULL,
  `PARTNERLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `competentinstitutionlist`
--

DROP TABLE IF EXISTS `competentinstitutionlist`;
CREATE TABLE IF NOT EXISTS `competentinstitutionlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `competentinstitutionlist_competentinstitution`
--

DROP TABLE IF EXISTS `competentinstitutionlist_competentinstitution`;
CREATE TABLE IF NOT EXISTS `competentinstitutionlist_competentinstitution` (
  `competentinstitutionlist_id` int(11) NOT NULL,
  `competentinstitution_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `complementarydocuments`
--

DROP TABLE IF EXISTS `complementarydocuments`;
CREATE TABLE IF NOT EXISTS `complementarydocuments` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CREDITTRANSFERLIST_ID` int(11) DEFAULT NULL,
  `LEARNINGAGREEMENTLIST_ID` int(11) DEFAULT NULL,
  `MEMORANDUMOFUNDERSTANDING_ID` int(11) DEFAULT NULL,
  `PROCEDUREANDGUIDELINELIST_ID` int(11) DEFAULT NULL,
  `TRANSCRIPTSOFRECORDLIST_ID` int(11) DEFAULT NULL,
  `USERGUIDELIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `credittransfer`
--

DROP TABLE IF EXISTS `credittransfer`;
CREATE TABLE IF NOT EXISTS `credittransfer` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `credittransferlist`
--

DROP TABLE IF EXISTS `credittransferlist`;
CREATE TABLE IF NOT EXISTS `credittransferlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `credittransferlist_credittransfer`
--

DROP TABLE IF EXISTS `credittransferlist_credittransfer`;
CREATE TABLE IF NOT EXISTS `credittransferlist_credittransfer` (
  `credittransferlist_id` int(11) NOT NULL,
  `credittransfer_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `credittransfer_attachment`
--

DROP TABLE IF EXISTS `credittransfer_attachment`;
CREATE TABLE IF NOT EXISTS `credittransfer_attachment` (
  `attachments_id` int(11) NOT NULL,
  `attachment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `ecvetframework`
--

DROP TABLE IF EXISTS `ecvetframework`;
CREATE TABLE IF NOT EXISTS `ecvetframework` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `COMPETENTINSTITUTIONLIST_ID` int(11) DEFAULT NULL,
  `COMPLEMENTARYDOCUMENTS_ID` int(11) DEFAULT NULL,
  `QUALIFICATION_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `evaluations`
--

DROP TABLE IF EXISTS `evaluations`;
CREATE TABLE IF NOT EXISTS `evaluations` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `ASSESSMENTLIST_ID` int(11) DEFAULT NULL,
  `RECOGNITIONLIST_ID` int(11) DEFAULT NULL,
  `VALIDATIONLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `learningagreement`
--

DROP TABLE IF EXISTS `learningagreement`;
CREATE TABLE IF NOT EXISTS `learningagreement` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `HOMEINSTITUTIONURI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `HOSTINGINSTITUTIONURI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `learningagreementlist`
--

DROP TABLE IF EXISTS `learningagreementlist`;
CREATE TABLE IF NOT EXISTS `learningagreementlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `learningagreementlist_learningagreement`
--

DROP TABLE IF EXISTS `learningagreementlist_learningagreement`;
CREATE TABLE IF NOT EXISTS `learningagreementlist_learningagreement` (
  `learningagreementlist_id` int(11) NOT NULL,
  `learningagreement_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `learningagreement_attachment`
--

DROP TABLE IF EXISTS `learningagreement_attachment`;
CREATE TABLE IF NOT EXISTS `learningagreement_attachment` (
  `attachments_id` int(11) NOT NULL,
  `attachment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `learningoutcome`
--

DROP TABLE IF EXISTS `learningoutcome`;
CREATE TABLE IF NOT EXISTS `learningoutcome` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `ECVETPOINTS` int(11) DEFAULT NULL,
  `RELATIVEWEIGHT` int(11) DEFAULT NULL,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `EVALUATIONS_ID` int(11) DEFAULT NULL,
  `QUALIFICATIONFRAMEWORKLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `learningoutcomelist`
--

DROP TABLE IF EXISTS `learningoutcomelist`;
CREATE TABLE IF NOT EXISTS `learningoutcomelist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `ECVETPOINTS` int(11) DEFAULT NULL,
  `RELATIVEWEIGHT` int(11) DEFAULT NULL,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `EVALUATIONS_ID` int(11) DEFAULT NULL,
  `QUALIFICATIONFRAMEWORKLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `learningoutcomelist_learningoutcome`
--

DROP TABLE IF EXISTS `learningoutcomelist_learningoutcome`;
CREATE TABLE IF NOT EXISTS `learningoutcomelist_learningoutcome` (
  `learningoutcome_id` int(11) NOT NULL,
  `learningoutcomelist_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `learningoutcomelist_learningoutcomelist`
--

DROP TABLE IF EXISTS `learningoutcomelist_learningoutcomelist`;
CREATE TABLE IF NOT EXISTS `learningoutcomelist_learningoutcomelist` (
  `learningoutcomelistparent_id` int(11) NOT NULL,
  `learningoutcomelist_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `legislation`
--

DROP TABLE IF EXISTS `legislation`;
CREATE TABLE IF NOT EXISTS `legislation` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `PRACTICES` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `RULES` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `legislationlist`
--

DROP TABLE IF EXISTS `legislationlist`;
CREATE TABLE IF NOT EXISTS `legislationlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `legislationlist_legislation`
--

DROP TABLE IF EXISTS `legislationlist_legislation`;
CREATE TABLE IF NOT EXISTS `legislationlist_legislation` (
  `legislationlist_id` int(11) NOT NULL,
  `legislation_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `memorandumofunderstanding`
--

DROP TABLE IF EXISTS `memorandumofunderstanding`;
CREATE TABLE IF NOT EXISTS `memorandumofunderstanding` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `memorandumofunderstanding_attachment`
--

DROP TABLE IF EXISTS `memorandumofunderstanding_attachment`;
CREATE TABLE IF NOT EXISTS `memorandumofunderstanding_attachment` (
  `attachments_id` int(11) NOT NULL,
  `attachment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `method`
--

DROP TABLE IF EXISTS `method`;
CREATE TABLE IF NOT EXISTS `method` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `methodlist`
--

DROP TABLE IF EXISTS `methodlist`;
CREATE TABLE IF NOT EXISTS `methodlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `methodlist_method`
--

DROP TABLE IF EXISTS `methodlist_method`;
CREATE TABLE IF NOT EXISTS `methodlist_method` (
  `methodlist_id` int(11) NOT NULL,
  `method_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `partner`
--

DROP TABLE IF EXISTS `partner`;
CREATE TABLE IF NOT EXISTS `partner` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `partnerlist`
--

DROP TABLE IF EXISTS `partnerlist`;
CREATE TABLE IF NOT EXISTS `partnerlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `partnerlist_partner`
--

DROP TABLE IF EXISTS `partnerlist_partner`;
CREATE TABLE IF NOT EXISTS `partnerlist_partner` (
  `partnerlist_id` int(11) NOT NULL,
  `partner_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `procedureAndGuideline`
--

DROP TABLE IF EXISTS `procedureAndGuideline`;
CREATE TABLE IF NOT EXISTS `procedureAndGuideline` (
  `ID` int(11) NOT NULL,
  `ASSESSMENT` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `RECOGNITION` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `VALIDATION` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `procedureandguidelinelist`
--

DROP TABLE IF EXISTS `procedureandguidelinelist`;
CREATE TABLE IF NOT EXISTS `procedureandguidelinelist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `procedureandguidelinelist_procedureAndGuideline`
--

DROP TABLE IF EXISTS `procedureandguidelinelist_procedureAndGuideline`;
CREATE TABLE IF NOT EXISTS `procedureandguidelinelist_procedureAndGuideline` (
  `procedureandguidelinelist_id` int(11) NOT NULL,
  `procedureandguideline_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `process`
--

DROP TABLE IF EXISTS `process`;
CREATE TABLE IF NOT EXISTS `process` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `processlist`
--

DROP TABLE IF EXISTS `processlist`;
CREATE TABLE IF NOT EXISTS `processlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `processlist_process`
--

DROP TABLE IF EXISTS `processlist_process`;
CREATE TABLE IF NOT EXISTS `processlist_process` (
  `processlist_id` int(11) NOT NULL,
  `process_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `qualification`
--

DROP TABLE IF EXISTS `qualification`;
CREATE TABLE IF NOT EXISTS `qualification` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `WHOLEECVETPOINTS` int(11) DEFAULT NULL,
  `UNITLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `qualificationframework`
--

DROP TABLE IF EXISTS `qualificationframework`;
CREATE TABLE IF NOT EXISTS `qualificationframework` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `FRAMEWORK` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `FRAMEWORKLEVEL` int(11) DEFAULT NULL,
  `FRAMEWORKTERM` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `INDICATOR` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `qualificationframeworklist`
--

DROP TABLE IF EXISTS `qualificationframeworklist`;
CREATE TABLE IF NOT EXISTS `qualificationframeworklist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `qualificationframeworklist_qualificationframework`
--

DROP TABLE IF EXISTS `qualificationframeworklist_qualificationframework`;
CREATE TABLE IF NOT EXISTS `qualificationframeworklist_qualificationframework` (
  `qualificationframeworklist_id` int(11) NOT NULL,
  `qualificationframework_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `recognition`
--

DROP TABLE IF EXISTS `recognition`;
CREATE TABLE IF NOT EXISTS `recognition` (
  `ID` int(11) NOT NULL,
  `COMPETENTINSTITUTIONURI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CERTIFICATETEMPLATE_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `recognitionlist`
--

DROP TABLE IF EXISTS `recognitionlist`;
CREATE TABLE IF NOT EXISTS `recognitionlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `recognitionlist_recognition`
--

DROP TABLE IF EXISTS `recognitionlist_recognition`;
CREATE TABLE IF NOT EXISTS `recognitionlist_recognition` (
  `recognitionlist_id` int(11) NOT NULL,
  `recognition_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `requirement`
--

DROP TABLE IF EXISTS `requirement`;
CREATE TABLE IF NOT EXISTS `requirement` (
  `ID` int(11) NOT NULL,
  `ACHIEVEMENTCRITERION` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `requirementlist`
--

DROP TABLE IF EXISTS `requirementlist`;
CREATE TABLE IF NOT EXISTS `requirementlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `requirementlist_requirement`
--

DROP TABLE IF EXISTS `requirementlist_requirement`;
CREATE TABLE IF NOT EXISTS `requirementlist_requirement` (
  `requirementlist_id` int(11) NOT NULL,
  `requirement_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `transcriptsofrecord`
--

DROP TABLE IF EXISTS `transcriptsofrecord`;
CREATE TABLE IF NOT EXISTS `transcriptsofrecord` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `transcriptsofrecordlist`
--

DROP TABLE IF EXISTS `transcriptsofrecordlist`;
CREATE TABLE IF NOT EXISTS `transcriptsofrecordlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `transcriptsofrecordlist_transcriptsofrecord`
--

DROP TABLE IF EXISTS `transcriptsofrecordlist_transcriptsofrecord`;
CREATE TABLE IF NOT EXISTS `transcriptsofrecordlist_transcriptsofrecord` (
  `transcriptsofrecordlist_id` int(11) NOT NULL,
  `transcriptsofrecord_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `transcriptsofrecord_attachment`
--

DROP TABLE IF EXISTS `transcriptsofrecord_attachment`;
CREATE TABLE IF NOT EXISTS `transcriptsofrecord_attachment` (
  `attachments_id` int(11) NOT NULL,
  `attachment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `unit`
--

DROP TABLE IF EXISTS `unit`;
CREATE TABLE IF NOT EXISTS `unit` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `ECVETPOINTS` int(11) DEFAULT NULL,
  `RELATIVEWEIGHT` int(11) DEFAULT NULL,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `EVALUATIONS_ID` int(11) DEFAULT NULL,
  `LEARNINGOUTCOMELIST_ID` int(11) DEFAULT NULL,
  `QUALIFICATIONFRAMEWORKLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `unitlist`
--

DROP TABLE IF EXISTS `unitlist`;
CREATE TABLE IF NOT EXISTS `unitlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `ECVETPOINTS` int(11) DEFAULT NULL,
  `RELATIVEWEIGHT` int(11) DEFAULT NULL,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `EVALUATIONS_ID` int(11) DEFAULT NULL,
  `QUALIFICATIONFRAMEWORKLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `unitlist_unit`
--

DROP TABLE IF EXISTS `unitlist_unit`;
CREATE TABLE IF NOT EXISTS `unitlist_unit` (
  `unitlist_id` int(11) NOT NULL,
  `unit_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `unitlist_unitlist`
--

DROP TABLE IF EXISTS `unitlist_unitlist`;
CREATE TABLE IF NOT EXISTS `unitlist_unitlist` (
  `unitlistparent_id` int(11) NOT NULL,
  `unitlist_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `userguide`
--

DROP TABLE IF EXISTS `userguide`;
CREATE TABLE IF NOT EXISTS `userguide` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `userguidelist`
--

DROP TABLE IF EXISTS `userguidelist`;
CREATE TABLE IF NOT EXISTS `userguidelist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `userguidelist_userguide`
--

DROP TABLE IF EXISTS `userguidelist_userguide`;
CREATE TABLE IF NOT EXISTS `userguidelist_userguide` (
  `userguidelist_id` int(11) NOT NULL,
  `userguide_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `userguide_attachment`
--

DROP TABLE IF EXISTS `userguide_attachment`;
CREATE TABLE IF NOT EXISTS `userguide_attachment` (
  `attachments_id` int(11) NOT NULL,
  `attachment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `validation`
--

DROP TABLE IF EXISTS `validation`;
CREATE TABLE IF NOT EXISTS `validation` (
  `ID` int(11) NOT NULL,
  `ASSESSMENTURI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `REQUIREMENTLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `validationlist`
--

DROP TABLE IF EXISTS `validationlist`;
CREATE TABLE IF NOT EXISTS `validationlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `validationlist_validation`
--

DROP TABLE IF EXISTS `validationlist_validation`;
CREATE TABLE IF NOT EXISTS `validationlist_validation` (
  `validationlist_id` int(11) NOT NULL,
  `validation_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `assessment`
--
ALTER TABLE `assessment`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_assessment_PROCESSLIST_ID` (`PROCESSLIST_ID`), ADD KEY `FK_assessment_METHODLIST_ID` (`METHODLIST_ID`);

--
-- Indexes for table `assessmentlist`
--
ALTER TABLE `assessmentlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `assessmentlist_assessment`
--
ALTER TABLE `assessmentlist_assessment`
  ADD PRIMARY KEY (`assessmentlist_id`,`assessment_id`), ADD KEY `FK_assessmentlist_assessment_assessment_id` (`assessment_id`);

--
-- Indexes for table `attachment`
--
ALTER TABLE `attachment`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `certificatetemplate`
--
ALTER TABLE `certificatetemplate`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `certificatetemplate_attachment`
--
ALTER TABLE `certificatetemplate_attachment`
  ADD PRIMARY KEY (`attachments_id`,`attachment_id`), ADD KEY `FK_certificatetemplate_attachment_attachment_id` (`attachment_id`);

--
-- Indexes for table `competentinstitution`
--
ALTER TABLE `competentinstitution`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_competentinstitution_LEGISLATIONLIST_ID` (`LEGISLATIONLIST_ID`), ADD KEY `FK_competentinstitution_PARTNERLIST_ID` (`PARTNERLIST_ID`);

--
-- Indexes for table `competentinstitutionlist`
--
ALTER TABLE `competentinstitutionlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `competentinstitutionlist_competentinstitution`
--
ALTER TABLE `competentinstitutionlist_competentinstitution`
  ADD PRIMARY KEY (`competentinstitutionlist_id`,`competentinstitution_id`), ADD KEY `cmptntnstttnlistcompetentinstitutioncmptntnstttnid` (`competentinstitution_id`);

--
-- Indexes for table `complementarydocuments`
--
ALTER TABLE `complementarydocuments`
  ADD PRIMARY KEY (`ID`), ADD KEY `complementarydocumentsPROCEDUREANDGUIDELINELIST_ID` (`PROCEDUREANDGUIDELINELIST_ID`), ADD KEY `complementarydocuments_TRANSCRIPTSOFRECORDLIST_ID` (`TRANSCRIPTSOFRECORDLIST_ID`), ADD KEY `FK_complementarydocuments_CREDITTRANSFERLIST_ID` (`CREDITTRANSFERLIST_ID`), ADD KEY `FK_complementarydocuments_LEARNINGAGREEMENTLIST_ID` (`LEARNINGAGREEMENTLIST_ID`), ADD KEY `FK_complementarydocuments_USERGUIDELIST_ID` (`USERGUIDELIST_ID`), ADD KEY `complementarydocumentsMEMORANDUMOFUNDERSTANDING_ID` (`MEMORANDUMOFUNDERSTANDING_ID`);

--
-- Indexes for table `credittransfer`
--
ALTER TABLE `credittransfer`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `credittransferlist`
--
ALTER TABLE `credittransferlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `credittransferlist_credittransfer`
--
ALTER TABLE `credittransferlist_credittransfer`
  ADD PRIMARY KEY (`credittransferlist_id`,`credittransfer_id`), ADD KEY `credittransferlist_credittransfercredittransfer_id` (`credittransfer_id`);

--
-- Indexes for table `credittransfer_attachment`
--
ALTER TABLE `credittransfer_attachment`
  ADD PRIMARY KEY (`attachments_id`,`attachment_id`), ADD KEY `FK_credittransfer_attachment_attachment_id` (`attachment_id`);

--
-- Indexes for table `ecvetframework`
--
ALTER TABLE `ecvetframework`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_ecvetframework_COMPETENTINSTITUTIONLIST_ID` (`COMPETENTINSTITUTIONLIST_ID`), ADD KEY `FK_ecvetframework_QUALIFICATION_ID` (`QUALIFICATION_ID`), ADD KEY `FK_ecvetframework_COMPLEMENTARYDOCUMENTS_ID` (`COMPLEMENTARYDOCUMENTS_ID`);

--
-- Indexes for table `evaluations`
--
ALTER TABLE `evaluations`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_evaluations_VALIDATIONLIST_ID` (`VALIDATIONLIST_ID`), ADD KEY `FK_evaluations_RECOGNITIONLIST_ID` (`RECOGNITIONLIST_ID`), ADD KEY `FK_evaluations_ASSESSMENTLIST_ID` (`ASSESSMENTLIST_ID`);

--
-- Indexes for table `learningagreement`
--
ALTER TABLE `learningagreement`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `learningagreementlist`
--
ALTER TABLE `learningagreementlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `learningagreementlist_learningagreement`
--
ALTER TABLE `learningagreementlist_learningagreement`
  ADD PRIMARY KEY (`learningagreementlist_id`,`learningagreement_id`), ADD KEY `lrnnggreementlistlearningagreementlrnngagreementid` (`learningagreement_id`);

--
-- Indexes for table `learningagreement_attachment`
--
ALTER TABLE `learningagreement_attachment`
  ADD PRIMARY KEY (`attachments_id`,`attachment_id`), ADD KEY `FK_learningagreement_attachment_attachment_id` (`attachment_id`);

--
-- Indexes for table `learningoutcome`
--
ALTER TABLE `learningoutcome`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_learningoutcome_QUALIFICATIONFRAMEWORKLIST_ID` (`QUALIFICATIONFRAMEWORKLIST_ID`), ADD KEY `FK_learningoutcome_EVALUATIONS_ID` (`EVALUATIONS_ID`);

--
-- Indexes for table `learningoutcomelist`
--
ALTER TABLE `learningoutcomelist`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_learningoutcomelist_EVALUATIONS_ID` (`EVALUATIONS_ID`), ADD KEY `learningoutcomelist_QUALIFICATIONFRAMEWORKLIST_ID` (`QUALIFICATIONFRAMEWORKLIST_ID`);

--
-- Indexes for table `learningoutcomelist_learningoutcome`
--
ALTER TABLE `learningoutcomelist_learningoutcome`
  ADD PRIMARY KEY (`learningoutcome_id`,`learningoutcomelist_id`), ADD KEY `lrnngoutcomelistlearningoutcomelrningoutcomelistid` (`learningoutcomelist_id`);

--
-- Indexes for table `learningoutcomelist_learningoutcomelist`
--
ALTER TABLE `learningoutcomelist_learningoutcomelist`
  ADD PRIMARY KEY (`learningoutcomelistparent_id`,`learningoutcomelist_id`), ADD KEY `lrnngtcomelistlearningoutcomelistlrnngutcomelistid` (`learningoutcomelist_id`);

--
-- Indexes for table `legislation`
--
ALTER TABLE `legislation`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `legislationlist`
--
ALTER TABLE `legislationlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `legislationlist_legislation`
--
ALTER TABLE `legislationlist_legislation`
  ADD PRIMARY KEY (`legislationlist_id`,`legislation_id`), ADD KEY `FK_legislationlist_legislation_legislation_id` (`legislation_id`);

--
-- Indexes for table `memorandumofunderstanding`
--
ALTER TABLE `memorandumofunderstanding`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `memorandumofunderstanding_attachment`
--
ALTER TABLE `memorandumofunderstanding_attachment`
  ADD PRIMARY KEY (`attachments_id`,`attachment_id`), ADD KEY `memorandumofunderstanding_attachment_attachment_id` (`attachment_id`);

--
-- Indexes for table `method`
--
ALTER TABLE `method`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `methodlist`
--
ALTER TABLE `methodlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `methodlist_method`
--
ALTER TABLE `methodlist_method`
  ADD PRIMARY KEY (`methodlist_id`,`method_id`), ADD KEY `FK_methodlist_method_method_id` (`method_id`);

--
-- Indexes for table `partner`
--
ALTER TABLE `partner`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `partnerlist`
--
ALTER TABLE `partnerlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `partnerlist_partner`
--
ALTER TABLE `partnerlist_partner`
  ADD PRIMARY KEY (`partnerlist_id`,`partner_id`), ADD KEY `FK_partnerlist_partner_partner_id` (`partner_id`);

--
-- Indexes for table `procedureAndGuideline`
--
ALTER TABLE `procedureAndGuideline`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `procedureandguidelinelist`
--
ALTER TABLE `procedureandguidelinelist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `procedureandguidelinelist_procedureAndGuideline`
--
ALTER TABLE `procedureandguidelinelist_procedureAndGuideline`
  ADD PRIMARY KEY (`procedureandguidelinelist_id`,`procedureandguideline_id`), ADD KEY `prcdrndgdlnlistprocedureAndGuidelineprcdrndgdlneid` (`procedureandguideline_id`);

--
-- Indexes for table `process`
--
ALTER TABLE `process`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `processlist`
--
ALTER TABLE `processlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `processlist_process`
--
ALTER TABLE `processlist_process`
  ADD PRIMARY KEY (`processlist_id`,`process_id`), ADD KEY `FK_processlist_process_process_id` (`process_id`);

--
-- Indexes for table `qualification`
--
ALTER TABLE `qualification`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_qualification_UNITLIST_ID` (`UNITLIST_ID`);

--
-- Indexes for table `qualificationframework`
--
ALTER TABLE `qualificationframework`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `qualificationframeworklist`
--
ALTER TABLE `qualificationframeworklist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `qualificationframeworklist_qualificationframework`
--
ALTER TABLE `qualificationframeworklist_qualificationframework`
  ADD PRIMARY KEY (`qualificationframeworklist_id`,`qualificationframework_id`), ADD KEY `qlfctnfrmwrklstqualificationframeworkqlfctnfrmwrkd` (`qualificationframework_id`);

--
-- Indexes for table `recognition`
--
ALTER TABLE `recognition`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_recognition_CERTIFICATETEMPLATE_ID` (`CERTIFICATETEMPLATE_ID`);

--
-- Indexes for table `recognitionlist`
--
ALTER TABLE `recognitionlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `recognitionlist_recognition`
--
ALTER TABLE `recognitionlist_recognition`
  ADD PRIMARY KEY (`recognitionlist_id`,`recognition_id`), ADD KEY `FK_recognitionlist_recognition_recognition_id` (`recognition_id`);

--
-- Indexes for table `requirement`
--
ALTER TABLE `requirement`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `requirementlist`
--
ALTER TABLE `requirementlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `requirementlist_requirement`
--
ALTER TABLE `requirementlist_requirement`
  ADD PRIMARY KEY (`requirementlist_id`,`requirement_id`), ADD KEY `FK_requirementlist_requirement_requirement_id` (`requirement_id`);

--
-- Indexes for table `transcriptsofrecord`
--
ALTER TABLE `transcriptsofrecord`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `transcriptsofrecordlist`
--
ALTER TABLE `transcriptsofrecordlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `transcriptsofrecordlist_transcriptsofrecord`
--
ALTER TABLE `transcriptsofrecordlist_transcriptsofrecord`
  ADD PRIMARY KEY (`transcriptsofrecordlist_id`,`transcriptsofrecord_id`), ADD KEY `trnscrptsfrcrdlsttrnscriptsofrecordtrnscrptsfrcrdd` (`transcriptsofrecord_id`);

--
-- Indexes for table `transcriptsofrecord_attachment`
--
ALTER TABLE `transcriptsofrecord_attachment`
  ADD PRIMARY KEY (`attachments_id`,`attachment_id`), ADD KEY `FK_transcriptsofrecord_attachment_attachment_id` (`attachment_id`);

--
-- Indexes for table `unit`
--
ALTER TABLE `unit`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_unit_EVALUATIONS_ID` (`EVALUATIONS_ID`), ADD KEY `FK_unit_LEARNINGOUTCOMELIST_ID` (`LEARNINGOUTCOMELIST_ID`), ADD KEY `FK_unit_QUALIFICATIONFRAMEWORKLIST_ID` (`QUALIFICATIONFRAMEWORKLIST_ID`);

--
-- Indexes for table `unitlist`
--
ALTER TABLE `unitlist`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_unitlist_QUALIFICATIONFRAMEWORKLIST_ID` (`QUALIFICATIONFRAMEWORKLIST_ID`), ADD KEY `FK_unitlist_EVALUATIONS_ID` (`EVALUATIONS_ID`);

--
-- Indexes for table `unitlist_unit`
--
ALTER TABLE `unitlist_unit`
  ADD PRIMARY KEY (`unitlist_id`,`unit_id`), ADD KEY `FK_unitlist_unit_unit_id` (`unit_id`);

--
-- Indexes for table `unitlist_unitlist`
--
ALTER TABLE `unitlist_unitlist`
  ADD PRIMARY KEY (`unitlistparent_id`,`unitlist_id`), ADD KEY `FK_unitlist_unitlist_unitlist_id` (`unitlist_id`);

--
-- Indexes for table `userguide`
--
ALTER TABLE `userguide`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `userguidelist`
--
ALTER TABLE `userguidelist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `userguidelist_userguide`
--
ALTER TABLE `userguidelist_userguide`
  ADD PRIMARY KEY (`userguidelist_id`,`userguide_id`), ADD KEY `FK_userguidelist_userguide_userguide_id` (`userguide_id`);

--
-- Indexes for table `userguide_attachment`
--
ALTER TABLE `userguide_attachment`
  ADD PRIMARY KEY (`attachments_id`,`attachment_id`), ADD KEY `FK_userguide_attachment_attachment_id` (`attachment_id`);

--
-- Indexes for table `validation`
--
ALTER TABLE `validation`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_validation_REQUIREMENTLIST_ID` (`REQUIREMENTLIST_ID`);

--
-- Indexes for table `validationlist`
--
ALTER TABLE `validationlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `validationlist_validation`
--
ALTER TABLE `validationlist_validation`
  ADD PRIMARY KEY (`validationlist_id`,`validation_id`), ADD KEY `FK_validationlist_validation_validation_id` (`validation_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `assessment`
--
ALTER TABLE `assessment`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `assessmentlist`
--
ALTER TABLE `assessmentlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `attachment`
--
ALTER TABLE `attachment`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `certificatetemplate`
--
ALTER TABLE `certificatetemplate`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `competentinstitution`
--
ALTER TABLE `competentinstitution`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `competentinstitutionlist`
--
ALTER TABLE `competentinstitutionlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `complementarydocuments`
--
ALTER TABLE `complementarydocuments`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `credittransfer`
--
ALTER TABLE `credittransfer`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `credittransferlist`
--
ALTER TABLE `credittransferlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `ecvetframework`
--
ALTER TABLE `ecvetframework`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `evaluations`
--
ALTER TABLE `evaluations`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `learningagreement`
--
ALTER TABLE `learningagreement`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `learningagreementlist`
--
ALTER TABLE `learningagreementlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `learningoutcome`
--
ALTER TABLE `learningoutcome`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `learningoutcomelist`
--
ALTER TABLE `learningoutcomelist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `legislation`
--
ALTER TABLE `legislation`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `legislationlist`
--
ALTER TABLE `legislationlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `memorandumofunderstanding`
--
ALTER TABLE `memorandumofunderstanding`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `method`
--
ALTER TABLE `method`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `methodlist`
--
ALTER TABLE `methodlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `partner`
--
ALTER TABLE `partner`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `partnerlist`
--
ALTER TABLE `partnerlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `procedureAndGuideline`
--
ALTER TABLE `procedureAndGuideline`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `procedureandguidelinelist`
--
ALTER TABLE `procedureandguidelinelist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `process`
--
ALTER TABLE `process`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `processlist`
--
ALTER TABLE `processlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `qualification`
--
ALTER TABLE `qualification`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `qualificationframework`
--
ALTER TABLE `qualificationframework`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `qualificationframeworklist`
--
ALTER TABLE `qualificationframeworklist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `recognition`
--
ALTER TABLE `recognition`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `recognitionlist`
--
ALTER TABLE `recognitionlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `requirement`
--
ALTER TABLE `requirement`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `requirementlist`
--
ALTER TABLE `requirementlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `transcriptsofrecord`
--
ALTER TABLE `transcriptsofrecord`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `transcriptsofrecordlist`
--
ALTER TABLE `transcriptsofrecordlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `unit`
--
ALTER TABLE `unit`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `unitlist`
--
ALTER TABLE `unitlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `userguide`
--
ALTER TABLE `userguide`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `userguidelist`
--
ALTER TABLE `userguidelist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `validation`
--
ALTER TABLE `validation`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `validationlist`
--
ALTER TABLE `validationlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `assessment`
--
ALTER TABLE `assessment`
ADD CONSTRAINT `FK_assessment_METHODLIST_ID` FOREIGN KEY (`METHODLIST_ID`) REFERENCES `methodlist` (`ID`),
ADD CONSTRAINT `FK_assessment_PROCESSLIST_ID` FOREIGN KEY (`PROCESSLIST_ID`) REFERENCES `processlist` (`ID`);

--
-- Constraints for table `assessmentlist_assessment`
--
ALTER TABLE `assessmentlist_assessment`
ADD CONSTRAINT `FK_assessmentlist_assessment_assessment_id` FOREIGN KEY (`assessment_id`) REFERENCES `assessment` (`ID`),
ADD CONSTRAINT `FK_assessmentlist_assessment_assessmentlist_id` FOREIGN KEY (`assessmentlist_id`) REFERENCES `assessmentlist` (`ID`);

--
-- Constraints for table `certificatetemplate_attachment`
--
ALTER TABLE `certificatetemplate_attachment`
ADD CONSTRAINT `FK_certificatetemplate_attachment_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`ID`),
ADD CONSTRAINT `FK_certificatetemplate_attachment_attachments_id` FOREIGN KEY (`attachments_id`) REFERENCES `certificatetemplate` (`ID`);

--
-- Constraints for table `competentinstitution`
--
ALTER TABLE `competentinstitution`
ADD CONSTRAINT `FK_competentinstitution_LEGISLATIONLIST_ID` FOREIGN KEY (`LEGISLATIONLIST_ID`) REFERENCES `legislationlist` (`ID`),
ADD CONSTRAINT `FK_competentinstitution_PARTNERLIST_ID` FOREIGN KEY (`PARTNERLIST_ID`) REFERENCES `partnerlist` (`ID`);

--
-- Constraints for table `competentinstitutionlist_competentinstitution`
--
ALTER TABLE `competentinstitutionlist_competentinstitution`
ADD CONSTRAINT `cmptntnstttnlistcompetentinstitutioncmptntnstttnid` FOREIGN KEY (`competentinstitution_id`) REFERENCES `competentinstitution` (`ID`),
ADD CONSTRAINT `cmptntnstttnlstcmpetentinstitutioncmptntnstttnlstd` FOREIGN KEY (`competentinstitutionlist_id`) REFERENCES `competentinstitutionlist` (`ID`);

--
-- Constraints for table `complementarydocuments`
--
ALTER TABLE `complementarydocuments`
ADD CONSTRAINT `FK_complementarydocuments_CREDITTRANSFERLIST_ID` FOREIGN KEY (`CREDITTRANSFERLIST_ID`) REFERENCES `credittransferlist` (`ID`),
ADD CONSTRAINT `FK_complementarydocuments_LEARNINGAGREEMENTLIST_ID` FOREIGN KEY (`LEARNINGAGREEMENTLIST_ID`) REFERENCES `learningagreementlist` (`ID`),
ADD CONSTRAINT `FK_complementarydocuments_USERGUIDELIST_ID` FOREIGN KEY (`USERGUIDELIST_ID`) REFERENCES `userguidelist` (`ID`),
ADD CONSTRAINT `complementarydocumentsMEMORANDUMOFUNDERSTANDING_ID` FOREIGN KEY (`MEMORANDUMOFUNDERSTANDING_ID`) REFERENCES `memorandumofunderstanding` (`ID`),
ADD CONSTRAINT `complementarydocumentsPROCEDUREANDGUIDELINELIST_ID` FOREIGN KEY (`PROCEDUREANDGUIDELINELIST_ID`) REFERENCES `procedureandguidelinelist` (`ID`),
ADD CONSTRAINT `complementarydocuments_TRANSCRIPTSOFRECORDLIST_ID` FOREIGN KEY (`TRANSCRIPTSOFRECORDLIST_ID`) REFERENCES `transcriptsofrecordlist` (`ID`);

--
-- Constraints for table `credittransferlist_credittransfer`
--
ALTER TABLE `credittransferlist_credittransfer`
ADD CONSTRAINT `crdittransferlistcredittransfercrdittransferlistid` FOREIGN KEY (`credittransferlist_id`) REFERENCES `credittransferlist` (`ID`),
ADD CONSTRAINT `credittransferlist_credittransfercredittransfer_id` FOREIGN KEY (`credittransfer_id`) REFERENCES `credittransfer` (`ID`);

--
-- Constraints for table `credittransfer_attachment`
--
ALTER TABLE `credittransfer_attachment`
ADD CONSTRAINT `FK_credittransfer_attachment_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`ID`),
ADD CONSTRAINT `FK_credittransfer_attachment_attachments_id` FOREIGN KEY (`attachments_id`) REFERENCES `credittransfer` (`ID`);

--
-- Constraints for table `ecvetframework`
--
ALTER TABLE `ecvetframework`
ADD CONSTRAINT `FK_ecvetframework_COMPETENTINSTITUTIONLIST_ID` FOREIGN KEY (`COMPETENTINSTITUTIONLIST_ID`) REFERENCES `competentinstitutionlist` (`ID`),
ADD CONSTRAINT `FK_ecvetframework_COMPLEMENTARYDOCUMENTS_ID` FOREIGN KEY (`COMPLEMENTARYDOCUMENTS_ID`) REFERENCES `complementarydocuments` (`ID`),
ADD CONSTRAINT `FK_ecvetframework_QUALIFICATION_ID` FOREIGN KEY (`QUALIFICATION_ID`) REFERENCES `qualification` (`ID`);

--
-- Constraints for table `evaluations`
--
ALTER TABLE `evaluations`
ADD CONSTRAINT `FK_evaluations_ASSESSMENTLIST_ID` FOREIGN KEY (`ASSESSMENTLIST_ID`) REFERENCES `assessmentlist` (`ID`),
ADD CONSTRAINT `FK_evaluations_RECOGNITIONLIST_ID` FOREIGN KEY (`RECOGNITIONLIST_ID`) REFERENCES `recognitionlist` (`ID`),
ADD CONSTRAINT `FK_evaluations_VALIDATIONLIST_ID` FOREIGN KEY (`VALIDATIONLIST_ID`) REFERENCES `validationlist` (`ID`);

--
-- Constraints for table `learningagreementlist_learningagreement`
--
ALTER TABLE `learningagreementlist_learningagreement`
ADD CONSTRAINT `lrnnggreementlistlearningagreementlrnngagreementid` FOREIGN KEY (`learningagreement_id`) REFERENCES `learningagreement` (`ID`),
ADD CONSTRAINT `lrnnggrmentlistlearningagreementlrnnggrementlistid` FOREIGN KEY (`learningagreementlist_id`) REFERENCES `learningagreementlist` (`ID`);

--
-- Constraints for table `learningagreement_attachment`
--
ALTER TABLE `learningagreement_attachment`
ADD CONSTRAINT `FK_learningagreement_attachment_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`ID`),
ADD CONSTRAINT `FK_learningagreement_attachment_attachments_id` FOREIGN KEY (`attachments_id`) REFERENCES `learningagreement` (`ID`);

--
-- Constraints for table `learningoutcome`
--
ALTER TABLE `learningoutcome`
ADD CONSTRAINT `FK_learningoutcome_EVALUATIONS_ID` FOREIGN KEY (`EVALUATIONS_ID`) REFERENCES `evaluations` (`ID`),
ADD CONSTRAINT `FK_learningoutcome_QUALIFICATIONFRAMEWORKLIST_ID` FOREIGN KEY (`QUALIFICATIONFRAMEWORKLIST_ID`) REFERENCES `qualificationframeworklist` (`ID`);

--
-- Constraints for table `learningoutcomelist`
--
ALTER TABLE `learningoutcomelist`
ADD CONSTRAINT `FK_learningoutcomelist_EVALUATIONS_ID` FOREIGN KEY (`EVALUATIONS_ID`) REFERENCES `evaluations` (`ID`),
ADD CONSTRAINT `learningoutcomelist_QUALIFICATIONFRAMEWORKLIST_ID` FOREIGN KEY (`QUALIFICATIONFRAMEWORKLIST_ID`) REFERENCES `qualificationframeworklist` (`ID`);

--
-- Constraints for table `learningoutcomelist_learningoutcome`
--
ALTER TABLE `learningoutcomelist_learningoutcome`
ADD CONSTRAINT `larningoutcomelistlearningoutcomelearningoutcomeid` FOREIGN KEY (`learningoutcome_id`) REFERENCES `learningoutcomelist` (`ID`),
ADD CONSTRAINT `lrnngoutcomelistlearningoutcomelrningoutcomelistid` FOREIGN KEY (`learningoutcomelist_id`) REFERENCES `learningoutcome` (`ID`);

--
-- Constraints for table `learningoutcomelist_learningoutcomelist`
--
ALTER TABLE `learningoutcomelist_learningoutcomelist`
ADD CONSTRAINT `lrnngtcmlstlearningoutcomelistlrnngtcmlistparentid` FOREIGN KEY (`learningoutcomelistparent_id`) REFERENCES `learningoutcomelist` (`ID`),
ADD CONSTRAINT `lrnngtcomelistlearningoutcomelistlrnngutcomelistid` FOREIGN KEY (`learningoutcomelist_id`) REFERENCES `learningoutcomelist` (`ID`);

--
-- Constraints for table `legislationlist_legislation`
--
ALTER TABLE `legislationlist_legislation`
ADD CONSTRAINT `FK_legislationlist_legislation_legislation_id` FOREIGN KEY (`legislation_id`) REFERENCES `legislation` (`ID`),
ADD CONSTRAINT `FK_legislationlist_legislation_legislationlist_id` FOREIGN KEY (`legislationlist_id`) REFERENCES `legislationlist` (`ID`);

--
-- Constraints for table `memorandumofunderstanding_attachment`
--
ALTER TABLE `memorandumofunderstanding_attachment`
ADD CONSTRAINT `memorandumofunderstanding_attachment_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`ID`),
ADD CONSTRAINT `memorandumofunderstanding_attachmentattachments_id` FOREIGN KEY (`attachments_id`) REFERENCES `memorandumofunderstanding` (`ID`);

--
-- Constraints for table `methodlist_method`
--
ALTER TABLE `methodlist_method`
ADD CONSTRAINT `FK_methodlist_method_method_id` FOREIGN KEY (`method_id`) REFERENCES `method` (`ID`),
ADD CONSTRAINT `FK_methodlist_method_methodlist_id` FOREIGN KEY (`methodlist_id`) REFERENCES `methodlist` (`ID`);

--
-- Constraints for table `partnerlist_partner`
--
ALTER TABLE `partnerlist_partner`
ADD CONSTRAINT `FK_partnerlist_partner_partner_id` FOREIGN KEY (`partner_id`) REFERENCES `partner` (`ID`),
ADD CONSTRAINT `FK_partnerlist_partner_partnerlist_id` FOREIGN KEY (`partnerlist_id`) REFERENCES `partnerlist` (`ID`);

--
-- Constraints for table `procedureandguidelinelist_procedureAndGuideline`
--
ALTER TABLE `procedureandguidelinelist_procedureAndGuideline`
ADD CONSTRAINT `prcdrndgdlnlistprocedureAndGuidelineprcdrndgdlneid` FOREIGN KEY (`procedureandguideline_id`) REFERENCES `procedureAndGuideline` (`ID`),
ADD CONSTRAINT `prcdrndgdlnlstprocedureAndGuidelineprcdrndgdlnlstd` FOREIGN KEY (`procedureandguidelinelist_id`) REFERENCES `procedureandguidelinelist` (`ID`);

--
-- Constraints for table `processlist_process`
--
ALTER TABLE `processlist_process`
ADD CONSTRAINT `FK_processlist_process_process_id` FOREIGN KEY (`process_id`) REFERENCES `process` (`ID`),
ADD CONSTRAINT `FK_processlist_process_processlist_id` FOREIGN KEY (`processlist_id`) REFERENCES `processlist` (`ID`);

--
-- Constraints for table `qualification`
--
ALTER TABLE `qualification`
ADD CONSTRAINT `FK_qualification_UNITLIST_ID` FOREIGN KEY (`UNITLIST_ID`) REFERENCES `unitlist` (`ID`);

--
-- Constraints for table `qualificationframeworklist_qualificationframework`
--
ALTER TABLE `qualificationframeworklist_qualificationframework`
ADD CONSTRAINT `qlfctnfrmwrklstqlficationframeworkqlfctnfrmwrklstd` FOREIGN KEY (`qualificationframeworklist_id`) REFERENCES `qualificationframeworklist` (`ID`),
ADD CONSTRAINT `qlfctnfrmwrklstqualificationframeworkqlfctnfrmwrkd` FOREIGN KEY (`qualificationframework_id`) REFERENCES `qualificationframework` (`ID`);

--
-- Constraints for table `recognition`
--
ALTER TABLE `recognition`
ADD CONSTRAINT `FK_recognition_CERTIFICATETEMPLATE_ID` FOREIGN KEY (`CERTIFICATETEMPLATE_ID`) REFERENCES `certificatetemplate` (`ID`);

--
-- Constraints for table `recognitionlist_recognition`
--
ALTER TABLE `recognitionlist_recognition`
ADD CONSTRAINT `FK_recognitionlist_recognition_recognition_id` FOREIGN KEY (`recognition_id`) REFERENCES `recognition` (`ID`),
ADD CONSTRAINT `FK_recognitionlist_recognition_recognitionlist_id` FOREIGN KEY (`recognitionlist_id`) REFERENCES `recognitionlist` (`ID`);

--
-- Constraints for table `requirementlist_requirement`
--
ALTER TABLE `requirementlist_requirement`
ADD CONSTRAINT `FK_requirementlist_requirement_requirement_id` FOREIGN KEY (`requirement_id`) REFERENCES `requirement` (`ID`),
ADD CONSTRAINT `FK_requirementlist_requirement_requirementlist_id` FOREIGN KEY (`requirementlist_id`) REFERENCES `requirementlist` (`ID`);

--
-- Constraints for table `transcriptsofrecordlist_transcriptsofrecord`
--
ALTER TABLE `transcriptsofrecordlist_transcriptsofrecord`
ADD CONSTRAINT `trnscrptsfrcrdlsttrnscriptsofrecordtrnscrptsfrcrdd` FOREIGN KEY (`transcriptsofrecord_id`) REFERENCES `transcriptsofrecord` (`ID`),
ADD CONSTRAINT `trnscrptsfrcrdlsttrnscrptsfrcordtrnscrptsfrcrdlstd` FOREIGN KEY (`transcriptsofrecordlist_id`) REFERENCES `transcriptsofrecordlist` (`ID`);

--
-- Constraints for table `transcriptsofrecord_attachment`
--
ALTER TABLE `transcriptsofrecord_attachment`
ADD CONSTRAINT `FK_transcriptsofrecord_attachment_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`ID`),
ADD CONSTRAINT `FK_transcriptsofrecord_attachment_attachments_id` FOREIGN KEY (`attachments_id`) REFERENCES `transcriptsofrecord` (`ID`);

--
-- Constraints for table `unit`
--
ALTER TABLE `unit`
ADD CONSTRAINT `FK_unit_EVALUATIONS_ID` FOREIGN KEY (`EVALUATIONS_ID`) REFERENCES `evaluations` (`ID`),
ADD CONSTRAINT `FK_unit_LEARNINGOUTCOMELIST_ID` FOREIGN KEY (`LEARNINGOUTCOMELIST_ID`) REFERENCES `learningoutcomelist` (`ID`),
ADD CONSTRAINT `FK_unit_QUALIFICATIONFRAMEWORKLIST_ID` FOREIGN KEY (`QUALIFICATIONFRAMEWORKLIST_ID`) REFERENCES `qualificationframeworklist` (`ID`);

--
-- Constraints for table `unitlist`
--
ALTER TABLE `unitlist`
ADD CONSTRAINT `FK_unitlist_EVALUATIONS_ID` FOREIGN KEY (`EVALUATIONS_ID`) REFERENCES `evaluations` (`ID`),
ADD CONSTRAINT `FK_unitlist_QUALIFICATIONFRAMEWORKLIST_ID` FOREIGN KEY (`QUALIFICATIONFRAMEWORKLIST_ID`) REFERENCES `qualificationframeworklist` (`ID`);

--
-- Constraints for table `unitlist_unit`
--
ALTER TABLE `unitlist_unit`
ADD CONSTRAINT `FK_unitlist_unit_unit_id` FOREIGN KEY (`unit_id`) REFERENCES `unit` (`ID`),
ADD CONSTRAINT `FK_unitlist_unit_unitlist_id` FOREIGN KEY (`unitlist_id`) REFERENCES `unitlist` (`ID`);

--
-- Constraints for table `unitlist_unitlist`
--
ALTER TABLE `unitlist_unitlist`
ADD CONSTRAINT `FK_unitlist_unitlist_unitlist_id` FOREIGN KEY (`unitlist_id`) REFERENCES `unitlist` (`ID`),
ADD CONSTRAINT `FK_unitlist_unitlist_unitlistparent_id` FOREIGN KEY (`unitlistparent_id`) REFERENCES `unitlist` (`ID`);

--
-- Constraints for table `userguidelist_userguide`
--
ALTER TABLE `userguidelist_userguide`
ADD CONSTRAINT `FK_userguidelist_userguide_userguide_id` FOREIGN KEY (`userguide_id`) REFERENCES `userguide` (`ID`),
ADD CONSTRAINT `FK_userguidelist_userguide_userguidelist_id` FOREIGN KEY (`userguidelist_id`) REFERENCES `userguidelist` (`ID`);

--
-- Constraints for table `userguide_attachment`
--
ALTER TABLE `userguide_attachment`
ADD CONSTRAINT `FK_userguide_attachment_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`ID`),
ADD CONSTRAINT `FK_userguide_attachment_attachments_id` FOREIGN KEY (`attachments_id`) REFERENCES `userguide` (`ID`);

--
-- Constraints for table `validation`
--
ALTER TABLE `validation`
ADD CONSTRAINT `FK_validation_REQUIREMENTLIST_ID` FOREIGN KEY (`REQUIREMENTLIST_ID`) REFERENCES `requirementlist` (`ID`);

--
-- Constraints for table `validationlist_validation`
--
ALTER TABLE `validationlist_validation`
ADD CONSTRAINT `FK_validationlist_validation_validation_id` FOREIGN KEY (`validation_id`) REFERENCES `validation` (`ID`),
ADD CONSTRAINT `FK_validationlist_validation_validationlist_id` FOREIGN KEY (`validationlist_id`) REFERENCES `validationlist` (`ID`);
SET FOREIGN_KEY_CHECKS=1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
