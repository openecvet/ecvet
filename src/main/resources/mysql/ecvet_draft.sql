-- phpMyAdmin SQL Dump
-- version 4.3.6
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Erstellungszeit: 02. Dez 2015 um 10:57
-- Server-Version: 5.5.46-0ubuntu0.14.04.2
-- PHP-Version: 5.5.9-1ubuntu4.14

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Datenbank: `ecvet_draft`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `assessment`
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
-- Tabellenstruktur für Tabelle `assessmentlist`
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
-- Tabellenstruktur für Tabelle `assessmentlist_assessment`
--

DROP TABLE IF EXISTS `assessmentlist_assessment`;
CREATE TABLE IF NOT EXISTS `assessmentlist_assessment` (
  `assessmentlist_id` int(11) NOT NULL,
  `assessment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `attachment`
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
-- Tabellenstruktur für Tabelle `certificatetemplate`
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
-- Tabellenstruktur für Tabelle `certificatetemplate_attachment`
--

DROP TABLE IF EXISTS `certificatetemplate_attachment`;
CREATE TABLE IF NOT EXISTS `certificatetemplate_attachment` (
  `attachments_id` int(11) NOT NULL,
  `attachment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `competentinstitution`
--

DROP TABLE IF EXISTS `competentinstitution`;
CREATE TABLE IF NOT EXISTS `competentinstitution` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `LEGISLATION_ID` int(11) DEFAULT NULL,
  `PARTNERLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `competentinstitutionlist`
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
-- Tabellenstruktur für Tabelle `competentinstitutionlist_competentinstitution`
--

DROP TABLE IF EXISTS `competentinstitutionlist_competentinstitution`;
CREATE TABLE IF NOT EXISTS `competentinstitutionlist_competentinstitution` (
  `competentinstitutionlist_id` int(11) NOT NULL,
  `competentinstitution_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `complementarydocumentlist`
--

DROP TABLE IF EXISTS `complementarydocumentlist`;
CREATE TABLE IF NOT EXISTS `complementarydocumentlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `LEARNINGAGREEMENTLIST_ID` int(11) DEFAULT NULL,
  `TRANSCRIPTIONOFRECORDLIST_ID` int(11) DEFAULT NULL,
  `USERGUIDELIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `confirmingrequirement`
--

DROP TABLE IF EXISTS `confirmingrequirement`;
CREATE TABLE IF NOT EXISTS `confirmingrequirement` (
  `ID` int(11) NOT NULL,
  `ASSESSMENTURI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `THRESHOLD` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `confirmingrequirementlist`
--

DROP TABLE IF EXISTS `confirmingrequirementlist`;
CREATE TABLE IF NOT EXISTS `confirmingrequirementlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `confirmingrequirementlist_confirmingrequirement`
--

DROP TABLE IF EXISTS `confirmingrequirementlist_confirmingrequirement`;
CREATE TABLE IF NOT EXISTS `confirmingrequirementlist_confirmingrequirement` (
  `confirmingrequirementlist_id` int(11) NOT NULL,
  `confirmingrequirement_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `ecvetframework`
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
-- Tabellenstruktur für Tabelle `evaluations`
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
-- Tabellenstruktur für Tabelle `learningagreement`
--

DROP TABLE IF EXISTS `learningagreement`;
CREATE TABLE IF NOT EXISTS `learningagreement` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `learningagreementlist`
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
-- Tabellenstruktur für Tabelle `learningagreementlist_learningagreement`
--

DROP TABLE IF EXISTS `learningagreementlist_learningagreement`;
CREATE TABLE IF NOT EXISTS `learningagreementlist_learningagreement` (
  `learningagreementlist_id` int(11) NOT NULL,
  `learningagreement_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `learningagreement_attachment`
--

DROP TABLE IF EXISTS `learningagreement_attachment`;
CREATE TABLE IF NOT EXISTS `learningagreement_attachment` (
  `attachments_id` int(11) NOT NULL,
  `attachment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `learningoutcome`
--

DROP TABLE IF EXISTS `learningoutcome`;
CREATE TABLE IF NOT EXISTS `learningoutcome` (
  `ID` int(11) NOT NULL,
  `CREDIT` int(11) DEFAULT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `LEARNINGOUTCOMETERMLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `learningoutcomelist`
--

DROP TABLE IF EXISTS `learningoutcomelist`;
CREATE TABLE IF NOT EXISTS `learningoutcomelist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `learningoutcomelist_learningoutcome`
--

DROP TABLE IF EXISTS `learningoutcomelist_learningoutcome`;
CREATE TABLE IF NOT EXISTS `learningoutcomelist_learningoutcome` (
  `learningoutcome_id` int(11) NOT NULL,
  `learningoutcomelist_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `learningoutcometerm`
--

DROP TABLE IF EXISTS `learningoutcometerm`;
CREATE TABLE IF NOT EXISTS `learningoutcometerm` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `WEIGHT` int(11) DEFAULT NULL,
  `EVALUATIONS_ID` int(11) DEFAULT NULL,
  `REFERENCELEVELLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `learningoutcometermlist`
--

DROP TABLE IF EXISTS `learningoutcometermlist`;
CREATE TABLE IF NOT EXISTS `learningoutcometermlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `learningoutcometermlist_learningoutcometerm`
--

DROP TABLE IF EXISTS `learningoutcometermlist_learningoutcometerm`;
CREATE TABLE IF NOT EXISTS `learningoutcometermlist_learningoutcometerm` (
  `learningoutcometermlist_id` int(11) NOT NULL,
  `learningoutcometerm_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `legislation`
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
-- Tabellenstruktur für Tabelle `method`
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
-- Tabellenstruktur für Tabelle `methodlist`
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
-- Tabellenstruktur für Tabelle `methodlist_method`
--

DROP TABLE IF EXISTS `methodlist_method`;
CREATE TABLE IF NOT EXISTS `methodlist_method` (
  `methodlist_id` int(11) NOT NULL,
  `method_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `partner`
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
-- Tabellenstruktur für Tabelle `partnerlist`
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
-- Tabellenstruktur für Tabelle `partnerlist_partner`
--

DROP TABLE IF EXISTS `partnerlist_partner`;
CREATE TABLE IF NOT EXISTS `partnerlist_partner` (
  `partnerlist_id` int(11) NOT NULL,
  `partner_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `process`
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
-- Tabellenstruktur für Tabelle `processlist`
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
-- Tabellenstruktur für Tabelle `processlist_process`
--

DROP TABLE IF EXISTS `processlist_process`;
CREATE TABLE IF NOT EXISTS `processlist_process` (
  `processlist_id` int(11) NOT NULL,
  `process_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `qualification`
--

DROP TABLE IF EXISTS `qualification`;
CREATE TABLE IF NOT EXISTS `qualification` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `UNITLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `recognition`
--

DROP TABLE IF EXISTS `recognition`;
CREATE TABLE IF NOT EXISTS `recognition` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `REST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `recognitionlist`
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
-- Tabellenstruktur für Tabelle `recognitionlist_recognition`
--

DROP TABLE IF EXISTS `recognitionlist_recognition`;
CREATE TABLE IF NOT EXISTS `recognitionlist_recognition` (
  `recognitionlist_id` int(11) NOT NULL,
  `recognition_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `referencelevel`
--

DROP TABLE IF EXISTS `referencelevel`;
CREATE TABLE IF NOT EXISTS `referencelevel` (
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
-- Tabellenstruktur für Tabelle `referencelevellist`
--

DROP TABLE IF EXISTS `referencelevellist`;
CREATE TABLE IF NOT EXISTS `referencelevellist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `referencelevellist_referencelevel`
--

DROP TABLE IF EXISTS `referencelevellist_referencelevel`;
CREATE TABLE IF NOT EXISTS `referencelevellist_referencelevel` (
  `referencelevellist_id` int(11) NOT NULL,
  `referencelevel_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `transcriptionofrecord`
--

DROP TABLE IF EXISTS `transcriptionofrecord`;
CREATE TABLE IF NOT EXISTS `transcriptionofrecord` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `transcriptionofrecordlist`
--

DROP TABLE IF EXISTS `transcriptionofrecordlist`;
CREATE TABLE IF NOT EXISTS `transcriptionofrecordlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `transcriptionofrecordlist_transcriptionofrecord`
--

DROP TABLE IF EXISTS `transcriptionofrecordlist_transcriptionofrecord`;
CREATE TABLE IF NOT EXISTS `transcriptionofrecordlist_transcriptionofrecord` (
  `transcriptionofrecordlist_id` int(11) NOT NULL,
  `transcriptionofrecord_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `transcriptionofrecord_attachment`
--

DROP TABLE IF EXISTS `transcriptionofrecord_attachment`;
CREATE TABLE IF NOT EXISTS `transcriptionofrecord_attachment` (
  `attachments_id` int(11) NOT NULL,
  `attachment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `unit`
--

DROP TABLE IF EXISTS `unit`;
CREATE TABLE IF NOT EXISTS `unit` (
  `ID` int(11) NOT NULL,
  `CREDIT` int(11) DEFAULT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `RELATIVEWEIGHT` int(11) DEFAULT NULL,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `WEIGHTSUM` int(11) DEFAULT NULL,
  `EVALUATIONS_ID` int(11) DEFAULT NULL,
  `LEARNINGOUTCOMELIST_ID` int(11) DEFAULT NULL,
  `REFERENCELEVELLIST_ID` int(11) DEFAULT NULL,
  `UNITLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `unitlist`
--

DROP TABLE IF EXISTS `unitlist`;
CREATE TABLE IF NOT EXISTS `unitlist` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `unitlist_unit`
--

DROP TABLE IF EXISTS `unitlist_unit`;
CREATE TABLE IF NOT EXISTS `unitlist_unit` (
  `unitlist_id` int(11) NOT NULL,
  `unit_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `userguide`
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
-- Tabellenstruktur für Tabelle `userguidelist`
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
-- Tabellenstruktur für Tabelle `userguidelist_userguide`
--

DROP TABLE IF EXISTS `userguidelist_userguide`;
CREATE TABLE IF NOT EXISTS `userguidelist_userguide` (
  `userguidelist_id` int(11) NOT NULL,
  `userguide_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `userguide_attachment`
--

DROP TABLE IF EXISTS `userguide_attachment`;
CREATE TABLE IF NOT EXISTS `userguide_attachment` (
  `attachments_id` int(11) NOT NULL,
  `attachment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `validation`
--

DROP TABLE IF EXISTS `validation`;
CREATE TABLE IF NOT EXISTS `validation` (
  `ID` int(11) NOT NULL,
  `DESCRIPTION` longtext COLLATE utf8_bin,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `URI` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CONFIRMINGREQUIREMENTLIST_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `validationlist`
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
-- Tabellenstruktur für Tabelle `validationlist_validation`
--

DROP TABLE IF EXISTS `validationlist_validation`;
CREATE TABLE IF NOT EXISTS `validationlist_validation` (
  `validationlist_id` int(11) NOT NULL,
  `validation_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `assessment`
--
ALTER TABLE `assessment`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_assessment_PROCESSLIST_ID` (`PROCESSLIST_ID`), ADD KEY `FK_assessment_METHODLIST_ID` (`METHODLIST_ID`);

--
-- Indizes für die Tabelle `assessmentlist`
--
ALTER TABLE `assessmentlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `assessmentlist_assessment`
--
ALTER TABLE `assessmentlist_assessment`
  ADD PRIMARY KEY (`assessmentlist_id`,`assessment_id`), ADD KEY `FK_assessmentlist_assessment_assessment_id` (`assessment_id`);

--
-- Indizes für die Tabelle `attachment`
--
ALTER TABLE `attachment`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `certificatetemplate`
--
ALTER TABLE `certificatetemplate`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `certificatetemplate_attachment`
--
ALTER TABLE `certificatetemplate_attachment`
  ADD PRIMARY KEY (`attachments_id`,`attachment_id`), ADD KEY `FK_certificatetemplate_attachment_attachment_id` (`attachment_id`);

--
-- Indizes für die Tabelle `competentinstitution`
--
ALTER TABLE `competentinstitution`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_competentinstitution_LEGISLATION_ID` (`LEGISLATION_ID`), ADD KEY `FK_competentinstitution_PARTNERLIST_ID` (`PARTNERLIST_ID`);

--
-- Indizes für die Tabelle `competentinstitutionlist`
--
ALTER TABLE `competentinstitutionlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `competentinstitutionlist_competentinstitution`
--
ALTER TABLE `competentinstitutionlist_competentinstitution`
  ADD PRIMARY KEY (`competentinstitutionlist_id`,`competentinstitution_id`), ADD KEY `cmptntnstttnlistcompetentinstitutioncmptntnstttnid` (`competentinstitution_id`);

--
-- Indizes für die Tabelle `complementarydocumentlist`
--
ALTER TABLE `complementarydocumentlist`
  ADD PRIMARY KEY (`ID`), ADD KEY `complementarydocumentlist_LEARNINGAGREEMENTLIST_ID` (`LEARNINGAGREEMENTLIST_ID`), ADD KEY `FK_complementarydocumentlist_USERGUIDELIST_ID` (`USERGUIDELIST_ID`), ADD KEY `cmplementarydocumentlistTRNSCRIPTIONOFRECORDLISTID` (`TRANSCRIPTIONOFRECORDLIST_ID`);

--
-- Indizes für die Tabelle `confirmingrequirement`
--
ALTER TABLE `confirmingrequirement`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `confirmingrequirementlist`
--
ALTER TABLE `confirmingrequirementlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `confirmingrequirementlist_confirmingrequirement`
--
ALTER TABLE `confirmingrequirementlist_confirmingrequirement`
  ADD PRIMARY KEY (`confirmingrequirementlist_id`,`confirmingrequirement_id`), ADD KEY `cnfrmngrqrmntlstcnfirmingrequirementcnfrmngrqrmntd` (`confirmingrequirement_id`);

--
-- Indizes für die Tabelle `ecvetframework`
--
ALTER TABLE `ecvetframework`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_ecvetframework_COMPETENTINSTITUTIONLIST_ID` (`COMPETENTINSTITUTIONLIST_ID`), ADD KEY `FK_ecvetframework_QUALIFICATION_ID` (`QUALIFICATION_ID`), ADD KEY `FK_ecvetframework_COMPLEMENTARYDOCUMENTS_ID` (`COMPLEMENTARYDOCUMENTS_ID`);

--
-- Indizes für die Tabelle `evaluations`
--
ALTER TABLE `evaluations`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_evaluations_VALIDATIONLIST_ID` (`VALIDATIONLIST_ID`), ADD KEY `FK_evaluations_RECOGNITIONLIST_ID` (`RECOGNITIONLIST_ID`), ADD KEY `FK_evaluations_ASSESSMENTLIST_ID` (`ASSESSMENTLIST_ID`);

--
-- Indizes für die Tabelle `learningagreement`
--
ALTER TABLE `learningagreement`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `learningagreementlist`
--
ALTER TABLE `learningagreementlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `learningagreementlist_learningagreement`
--
ALTER TABLE `learningagreementlist_learningagreement`
  ADD PRIMARY KEY (`learningagreementlist_id`,`learningagreement_id`), ADD KEY `lrnnggreementlistlearningagreementlrnngagreementid` (`learningagreement_id`);

--
-- Indizes für die Tabelle `learningagreement_attachment`
--
ALTER TABLE `learningagreement_attachment`
  ADD PRIMARY KEY (`attachments_id`,`attachment_id`), ADD KEY `FK_learningagreement_attachment_attachment_id` (`attachment_id`);

--
-- Indizes für die Tabelle `learningoutcome`
--
ALTER TABLE `learningoutcome`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_learningoutcome_LEARNINGOUTCOMETERMLIST_ID` (`LEARNINGOUTCOMETERMLIST_ID`);

--
-- Indizes für die Tabelle `learningoutcomelist`
--
ALTER TABLE `learningoutcomelist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `learningoutcomelist_learningoutcome`
--
ALTER TABLE `learningoutcomelist_learningoutcome`
  ADD PRIMARY KEY (`learningoutcome_id`,`learningoutcomelist_id`), ADD KEY `lrnngoutcomelistlearningoutcomelrningoutcomelistid` (`learningoutcomelist_id`);

--
-- Indizes für die Tabelle `learningoutcometerm`
--
ALTER TABLE `learningoutcometerm`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_learningoutcometerm_REFERENCELEVELLIST_ID` (`REFERENCELEVELLIST_ID`), ADD KEY `FK_learningoutcometerm_EVALUATIONS_ID` (`EVALUATIONS_ID`);

--
-- Indizes für die Tabelle `learningoutcometermlist`
--
ALTER TABLE `learningoutcometermlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `learningoutcometermlist_learningoutcometerm`
--
ALTER TABLE `learningoutcometermlist_learningoutcometerm`
  ADD PRIMARY KEY (`learningoutcometermlist_id`,`learningoutcometerm_id`), ADD KEY `lrnngtcmtermlistlearningoutcometermlrnngtcmetermid` (`learningoutcometerm_id`);

--
-- Indizes für die Tabelle `legislation`
--
ALTER TABLE `legislation`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `method`
--
ALTER TABLE `method`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `methodlist`
--
ALTER TABLE `methodlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `methodlist_method`
--
ALTER TABLE `methodlist_method`
  ADD PRIMARY KEY (`methodlist_id`,`method_id`), ADD KEY `FK_methodlist_method_method_id` (`method_id`);

--
-- Indizes für die Tabelle `partner`
--
ALTER TABLE `partner`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `partnerlist`
--
ALTER TABLE `partnerlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `partnerlist_partner`
--
ALTER TABLE `partnerlist_partner`
  ADD PRIMARY KEY (`partnerlist_id`,`partner_id`), ADD KEY `FK_partnerlist_partner_partner_id` (`partner_id`);

--
-- Indizes für die Tabelle `process`
--
ALTER TABLE `process`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `processlist`
--
ALTER TABLE `processlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `processlist_process`
--
ALTER TABLE `processlist_process`
  ADD PRIMARY KEY (`processlist_id`,`process_id`), ADD KEY `FK_processlist_process_process_id` (`process_id`);

--
-- Indizes für die Tabelle `qualification`
--
ALTER TABLE `qualification`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_qualification_UNITLIST_ID` (`UNITLIST_ID`);

--
-- Indizes für die Tabelle `recognition`
--
ALTER TABLE `recognition`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_recognition_REST_ID` (`REST_ID`);

--
-- Indizes für die Tabelle `recognitionlist`
--
ALTER TABLE `recognitionlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `recognitionlist_recognition`
--
ALTER TABLE `recognitionlist_recognition`
  ADD PRIMARY KEY (`recognitionlist_id`,`recognition_id`), ADD KEY `FK_recognitionlist_recognition_recognition_id` (`recognition_id`);

--
-- Indizes für die Tabelle `referencelevel`
--
ALTER TABLE `referencelevel`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `referencelevellist`
--
ALTER TABLE `referencelevellist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `referencelevellist_referencelevel`
--
ALTER TABLE `referencelevellist_referencelevel`
  ADD PRIMARY KEY (`referencelevellist_id`,`referencelevel_id`), ADD KEY `referencelevellist_referencelevelreferencelevel_id` (`referencelevel_id`);

--
-- Indizes für die Tabelle `transcriptionofrecord`
--
ALTER TABLE `transcriptionofrecord`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `transcriptionofrecordlist`
--
ALTER TABLE `transcriptionofrecordlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `transcriptionofrecordlist_transcriptionofrecord`
--
ALTER TABLE `transcriptionofrecordlist_transcriptionofrecord`
  ADD PRIMARY KEY (`transcriptionofrecordlist_id`,`transcriptionofrecord_id`), ADD KEY `trnscrptnfrcrdlsttrnscrptonofrecordtrnscrptnfrcrdd` (`transcriptionofrecord_id`);

--
-- Indizes für die Tabelle `transcriptionofrecord_attachment`
--
ALTER TABLE `transcriptionofrecord_attachment`
  ADD PRIMARY KEY (`attachments_id`,`attachment_id`), ADD KEY `FK_transcriptionofrecord_attachment_attachment_id` (`attachment_id`);

--
-- Indizes für die Tabelle `unit`
--
ALTER TABLE `unit`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_unit_REFERENCELEVELLIST_ID` (`REFERENCELEVELLIST_ID`), ADD KEY `FK_unit_EVALUATIONS_ID` (`EVALUATIONS_ID`), ADD KEY `FK_unit_LEARNINGOUTCOMELIST_ID` (`LEARNINGOUTCOMELIST_ID`), ADD KEY `FK_unit_UNITLIST_ID` (`UNITLIST_ID`);

--
-- Indizes für die Tabelle `unitlist`
--
ALTER TABLE `unitlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `unitlist_unit`
--
ALTER TABLE `unitlist_unit`
  ADD PRIMARY KEY (`unitlist_id`,`unit_id`), ADD KEY `FK_unitlist_unit_unit_id` (`unit_id`);

--
-- Indizes für die Tabelle `userguide`
--
ALTER TABLE `userguide`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `userguidelist`
--
ALTER TABLE `userguidelist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `userguidelist_userguide`
--
ALTER TABLE `userguidelist_userguide`
  ADD PRIMARY KEY (`userguidelist_id`,`userguide_id`), ADD KEY `FK_userguidelist_userguide_userguide_id` (`userguide_id`);

--
-- Indizes für die Tabelle `userguide_attachment`
--
ALTER TABLE `userguide_attachment`
  ADD PRIMARY KEY (`attachments_id`,`attachment_id`), ADD KEY `FK_userguide_attachment_attachment_id` (`attachment_id`);

--
-- Indizes für die Tabelle `validation`
--
ALTER TABLE `validation`
  ADD PRIMARY KEY (`ID`), ADD KEY `FK_validation_CONFIRMINGREQUIREMENTLIST_ID` (`CONFIRMINGREQUIREMENTLIST_ID`);

--
-- Indizes für die Tabelle `validationlist`
--
ALTER TABLE `validationlist`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `validationlist_validation`
--
ALTER TABLE `validationlist_validation`
  ADD PRIMARY KEY (`validationlist_id`,`validation_id`), ADD KEY `FK_validationlist_validation_validation_id` (`validation_id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `assessment`
--
ALTER TABLE `assessment`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `assessmentlist`
--
ALTER TABLE `assessmentlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `attachment`
--
ALTER TABLE `attachment`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `certificatetemplate`
--
ALTER TABLE `certificatetemplate`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `competentinstitution`
--
ALTER TABLE `competentinstitution`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `competentinstitutionlist`
--
ALTER TABLE `competentinstitutionlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `complementarydocumentlist`
--
ALTER TABLE `complementarydocumentlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `confirmingrequirement`
--
ALTER TABLE `confirmingrequirement`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `confirmingrequirementlist`
--
ALTER TABLE `confirmingrequirementlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `ecvetframework`
--
ALTER TABLE `ecvetframework`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `evaluations`
--
ALTER TABLE `evaluations`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `learningagreement`
--
ALTER TABLE `learningagreement`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `learningagreementlist`
--
ALTER TABLE `learningagreementlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `learningoutcome`
--
ALTER TABLE `learningoutcome`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `learningoutcomelist`
--
ALTER TABLE `learningoutcomelist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `learningoutcometerm`
--
ALTER TABLE `learningoutcometerm`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `learningoutcometermlist`
--
ALTER TABLE `learningoutcometermlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `legislation`
--
ALTER TABLE `legislation`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `method`
--
ALTER TABLE `method`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `methodlist`
--
ALTER TABLE `methodlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `partner`
--
ALTER TABLE `partner`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `partnerlist`
--
ALTER TABLE `partnerlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `process`
--
ALTER TABLE `process`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `processlist`
--
ALTER TABLE `processlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `qualification`
--
ALTER TABLE `qualification`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `recognition`
--
ALTER TABLE `recognition`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `recognitionlist`
--
ALTER TABLE `recognitionlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `referencelevel`
--
ALTER TABLE `referencelevel`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `referencelevellist`
--
ALTER TABLE `referencelevellist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `transcriptionofrecord`
--
ALTER TABLE `transcriptionofrecord`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `transcriptionofrecordlist`
--
ALTER TABLE `transcriptionofrecordlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `unit`
--
ALTER TABLE `unit`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `unitlist`
--
ALTER TABLE `unitlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `userguide`
--
ALTER TABLE `userguide`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `userguidelist`
--
ALTER TABLE `userguidelist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `validation`
--
ALTER TABLE `validation`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `validationlist`
--
ALTER TABLE `validationlist`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `assessment`
--
ALTER TABLE `assessment`
ADD CONSTRAINT `FK_assessment_METHODLIST_ID` FOREIGN KEY (`METHODLIST_ID`) REFERENCES `methodlist` (`ID`),
ADD CONSTRAINT `FK_assessment_PROCESSLIST_ID` FOREIGN KEY (`PROCESSLIST_ID`) REFERENCES `processlist` (`ID`);

--
-- Constraints der Tabelle `assessmentlist_assessment`
--
ALTER TABLE `assessmentlist_assessment`
ADD CONSTRAINT `FK_assessmentlist_assessment_assessmentlist_id` FOREIGN KEY (`assessmentlist_id`) REFERENCES `assessmentlist` (`ID`),
ADD CONSTRAINT `FK_assessmentlist_assessment_assessment_id` FOREIGN KEY (`assessment_id`) REFERENCES `assessment` (`ID`);

--
-- Constraints der Tabelle `certificatetemplate_attachment`
--
ALTER TABLE `certificatetemplate_attachment`
ADD CONSTRAINT `FK_certificatetemplate_attachment_attachments_id` FOREIGN KEY (`attachments_id`) REFERENCES `certificatetemplate` (`ID`),
ADD CONSTRAINT `FK_certificatetemplate_attachment_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`ID`);

--
-- Constraints der Tabelle `competentinstitution`
--
ALTER TABLE `competentinstitution`
ADD CONSTRAINT `FK_competentinstitution_PARTNERLIST_ID` FOREIGN KEY (`PARTNERLIST_ID`) REFERENCES `partnerlist` (`ID`),
ADD CONSTRAINT `FK_competentinstitution_LEGISLATION_ID` FOREIGN KEY (`LEGISLATION_ID`) REFERENCES `legislation` (`ID`);

--
-- Constraints der Tabelle `competentinstitutionlist_competentinstitution`
--
ALTER TABLE `competentinstitutionlist_competentinstitution`
ADD CONSTRAINT `cmptntnstttnlstcmpetentinstitutioncmptntnstttnlstd` FOREIGN KEY (`competentinstitutionlist_id`) REFERENCES `competentinstitutionlist` (`ID`),
ADD CONSTRAINT `cmptntnstttnlistcompetentinstitutioncmptntnstttnid` FOREIGN KEY (`competentinstitution_id`) REFERENCES `competentinstitution` (`ID`);

--
-- Constraints der Tabelle `complementarydocumentlist`
--
ALTER TABLE `complementarydocumentlist`
ADD CONSTRAINT `cmplementarydocumentlistTRNSCRIPTIONOFRECORDLISTID` FOREIGN KEY (`TRANSCRIPTIONOFRECORDLIST_ID`) REFERENCES `transcriptionofrecordlist` (`ID`),
ADD CONSTRAINT `complementarydocumentlist_LEARNINGAGREEMENTLIST_ID` FOREIGN KEY (`LEARNINGAGREEMENTLIST_ID`) REFERENCES `learningagreementlist` (`ID`),
ADD CONSTRAINT `FK_complementarydocumentlist_USERGUIDELIST_ID` FOREIGN KEY (`USERGUIDELIST_ID`) REFERENCES `userguidelist` (`ID`);

--
-- Constraints der Tabelle `confirmingrequirementlist_confirmingrequirement`
--
ALTER TABLE `confirmingrequirementlist_confirmingrequirement`
ADD CONSTRAINT `cnfrmngrqrmntlstcnfirmingrequirementcnfrmngrqrmntd` FOREIGN KEY (`confirmingrequirement_id`) REFERENCES `confirmingrequirement` (`ID`),
ADD CONSTRAINT `cnfrmngrqrmntlstcnfrmngrquirementcnfrmngrqrmntlstd` FOREIGN KEY (`confirmingrequirementlist_id`) REFERENCES `confirmingrequirementlist` (`ID`);

--
-- Constraints der Tabelle `ecvetframework`
--
ALTER TABLE `ecvetframework`
ADD CONSTRAINT `FK_ecvetframework_COMPLEMENTARYDOCUMENTS_ID` FOREIGN KEY (`COMPLEMENTARYDOCUMENTS_ID`) REFERENCES `complementarydocumentlist` (`ID`),
ADD CONSTRAINT `FK_ecvetframework_COMPETENTINSTITUTIONLIST_ID` FOREIGN KEY (`COMPETENTINSTITUTIONLIST_ID`) REFERENCES `competentinstitutionlist` (`ID`),
ADD CONSTRAINT `FK_ecvetframework_QUALIFICATION_ID` FOREIGN KEY (`QUALIFICATION_ID`) REFERENCES `qualification` (`ID`);

--
-- Constraints der Tabelle `evaluations`
--
ALTER TABLE `evaluations`
ADD CONSTRAINT `FK_evaluations_ASSESSMENTLIST_ID` FOREIGN KEY (`ASSESSMENTLIST_ID`) REFERENCES `assessmentlist` (`ID`),
ADD CONSTRAINT `FK_evaluations_RECOGNITIONLIST_ID` FOREIGN KEY (`RECOGNITIONLIST_ID`) REFERENCES `recognitionlist` (`ID`),
ADD CONSTRAINT `FK_evaluations_VALIDATIONLIST_ID` FOREIGN KEY (`VALIDATIONLIST_ID`) REFERENCES `validationlist` (`ID`);

--
-- Constraints der Tabelle `learningagreementlist_learningagreement`
--
ALTER TABLE `learningagreementlist_learningagreement`
ADD CONSTRAINT `lrnnggreementlistlearningagreementlrnngagreementid` FOREIGN KEY (`learningagreement_id`) REFERENCES `learningagreement` (`ID`),
ADD CONSTRAINT `lrnnggrmentlistlearningagreementlrnnggrementlistid` FOREIGN KEY (`learningagreementlist_id`) REFERENCES `learningagreementlist` (`ID`);

--
-- Constraints der Tabelle `learningagreement_attachment`
--
ALTER TABLE `learningagreement_attachment`
ADD CONSTRAINT `FK_learningagreement_attachment_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`ID`),
ADD CONSTRAINT `FK_learningagreement_attachment_attachments_id` FOREIGN KEY (`attachments_id`) REFERENCES `learningagreement` (`ID`);

--
-- Constraints der Tabelle `learningoutcome`
--
ALTER TABLE `learningoutcome`
ADD CONSTRAINT `FK_learningoutcome_LEARNINGOUTCOMETERMLIST_ID` FOREIGN KEY (`LEARNINGOUTCOMETERMLIST_ID`) REFERENCES `learningoutcometermlist` (`ID`);

--
-- Constraints der Tabelle `learningoutcomelist_learningoutcome`
--
ALTER TABLE `learningoutcomelist_learningoutcome`
ADD CONSTRAINT `larningoutcomelistlearningoutcomelearningoutcomeid` FOREIGN KEY (`learningoutcome_id`) REFERENCES `learningoutcomelist` (`ID`),
ADD CONSTRAINT `lrnngoutcomelistlearningoutcomelrningoutcomelistid` FOREIGN KEY (`learningoutcomelist_id`) REFERENCES `learningoutcome` (`ID`);

--
-- Constraints der Tabelle `learningoutcometerm`
--
ALTER TABLE `learningoutcometerm`
ADD CONSTRAINT `FK_learningoutcometerm_EVALUATIONS_ID` FOREIGN KEY (`EVALUATIONS_ID`) REFERENCES `evaluations` (`ID`),
ADD CONSTRAINT `FK_learningoutcometerm_REFERENCELEVELLIST_ID` FOREIGN KEY (`REFERENCELEVELLIST_ID`) REFERENCES `referencelevellist` (`ID`);

--
-- Constraints der Tabelle `learningoutcometermlist_learningoutcometerm`
--
ALTER TABLE `learningoutcometermlist_learningoutcometerm`
ADD CONSTRAINT `lrnngtcmtrmlstlearningoutcometermlrnngtcmtrmlistid` FOREIGN KEY (`learningoutcometermlist_id`) REFERENCES `learningoutcometermlist` (`ID`),
ADD CONSTRAINT `lrnngtcmtermlistlearningoutcometermlrnngtcmetermid` FOREIGN KEY (`learningoutcometerm_id`) REFERENCES `learningoutcometerm` (`ID`);

--
-- Constraints der Tabelle `methodlist_method`
--
ALTER TABLE `methodlist_method`
ADD CONSTRAINT `FK_methodlist_method_method_id` FOREIGN KEY (`method_id`) REFERENCES `method` (`ID`),
ADD CONSTRAINT `FK_methodlist_method_methodlist_id` FOREIGN KEY (`methodlist_id`) REFERENCES `methodlist` (`ID`);

--
-- Constraints der Tabelle `partnerlist_partner`
--
ALTER TABLE `partnerlist_partner`
ADD CONSTRAINT `FK_partnerlist_partner_partnerlist_id` FOREIGN KEY (`partnerlist_id`) REFERENCES `partnerlist` (`ID`),
ADD CONSTRAINT `FK_partnerlist_partner_partner_id` FOREIGN KEY (`partner_id`) REFERENCES `partner` (`ID`);

--
-- Constraints der Tabelle `processlist_process`
--
ALTER TABLE `processlist_process`
ADD CONSTRAINT `FK_processlist_process_process_id` FOREIGN KEY (`process_id`) REFERENCES `process` (`ID`),
ADD CONSTRAINT `FK_processlist_process_processlist_id` FOREIGN KEY (`processlist_id`) REFERENCES `processlist` (`ID`);

--
-- Constraints der Tabelle `qualification`
--
ALTER TABLE `qualification`
ADD CONSTRAINT `FK_qualification_UNITLIST_ID` FOREIGN KEY (`UNITLIST_ID`) REFERENCES `unitlist` (`ID`);

--
-- Constraints der Tabelle `recognition`
--
ALTER TABLE `recognition`
ADD CONSTRAINT `FK_recognition_REST_ID` FOREIGN KEY (`REST_ID`) REFERENCES `certificatetemplate` (`ID`);

--
-- Constraints der Tabelle `recognitionlist_recognition`
--
ALTER TABLE `recognitionlist_recognition`
ADD CONSTRAINT `FK_recognitionlist_recognition_recognition_id` FOREIGN KEY (`recognition_id`) REFERENCES `recognition` (`ID`),
ADD CONSTRAINT `FK_recognitionlist_recognition_recognitionlist_id` FOREIGN KEY (`recognitionlist_id`) REFERENCES `recognitionlist` (`ID`);

--
-- Constraints der Tabelle `referencelevellist_referencelevel`
--
ALTER TABLE `referencelevellist_referencelevel`
ADD CONSTRAINT `referencelevellist_referencelevelreferencelevel_id` FOREIGN KEY (`referencelevel_id`) REFERENCES `referencelevel` (`ID`),
ADD CONSTRAINT `rferencelevellistreferencelevelrferencelevellistid` FOREIGN KEY (`referencelevellist_id`) REFERENCES `referencelevellist` (`ID`);

--
-- Constraints der Tabelle `transcriptionofrecordlist_transcriptionofrecord`
--
ALTER TABLE `transcriptionofrecordlist_transcriptionofrecord`
ADD CONSTRAINT `trnscrptnfrcrdlsttrnscrptonofrecordtrnscrptnfrcrdd` FOREIGN KEY (`transcriptionofrecord_id`) REFERENCES `transcriptionofrecord` (`ID`),
ADD CONSTRAINT `trnscrptnfrcrdlsttrnscrptnfrcordtrnscrptnfrcrdlstd` FOREIGN KEY (`transcriptionofrecordlist_id`) REFERENCES `transcriptionofrecordlist` (`ID`);

--
-- Constraints der Tabelle `transcriptionofrecord_attachment`
--
ALTER TABLE `transcriptionofrecord_attachment`
ADD CONSTRAINT `FK_transcriptionofrecord_attachment_attachments_id` FOREIGN KEY (`attachments_id`) REFERENCES `transcriptionofrecord` (`ID`),
ADD CONSTRAINT `FK_transcriptionofrecord_attachment_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`ID`);

--
-- Constraints der Tabelle `unit`
--
ALTER TABLE `unit`
ADD CONSTRAINT `FK_unit_UNITLIST_ID` FOREIGN KEY (`UNITLIST_ID`) REFERENCES `unitlist` (`ID`),
ADD CONSTRAINT `FK_unit_EVALUATIONS_ID` FOREIGN KEY (`EVALUATIONS_ID`) REFERENCES `evaluations` (`ID`),
ADD CONSTRAINT `FK_unit_LEARNINGOUTCOMELIST_ID` FOREIGN KEY (`LEARNINGOUTCOMELIST_ID`) REFERENCES `learningoutcomelist` (`ID`),
ADD CONSTRAINT `FK_unit_REFERENCELEVELLIST_ID` FOREIGN KEY (`REFERENCELEVELLIST_ID`) REFERENCES `referencelevellist` (`ID`);

--
-- Constraints der Tabelle `unitlist_unit`
--
ALTER TABLE `unitlist_unit`
ADD CONSTRAINT `FK_unitlist_unit_unitlist_id` FOREIGN KEY (`unitlist_id`) REFERENCES `unitlist` (`ID`),
ADD CONSTRAINT `FK_unitlist_unit_unit_id` FOREIGN KEY (`unit_id`) REFERENCES `unit` (`ID`);

--
-- Constraints der Tabelle `userguidelist_userguide`
--
ALTER TABLE `userguidelist_userguide`
ADD CONSTRAINT `FK_userguidelist_userguide_userguidelist_id` FOREIGN KEY (`userguidelist_id`) REFERENCES `userguidelist` (`ID`),
ADD CONSTRAINT `FK_userguidelist_userguide_userguide_id` FOREIGN KEY (`userguide_id`) REFERENCES `userguide` (`ID`);

--
-- Constraints der Tabelle `userguide_attachment`
--
ALTER TABLE `userguide_attachment`
ADD CONSTRAINT `FK_userguide_attachment_attachments_id` FOREIGN KEY (`attachments_id`) REFERENCES `userguide` (`ID`),
ADD CONSTRAINT `FK_userguide_attachment_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`ID`);

--
-- Constraints der Tabelle `validation`
--
ALTER TABLE `validation`
ADD CONSTRAINT `FK_validation_CONFIRMINGREQUIREMENTLIST_ID` FOREIGN KEY (`CONFIRMINGREQUIREMENTLIST_ID`) REFERENCES `confirmingrequirementlist` (`ID`);

--
-- Constraints der Tabelle `validationlist_validation`
--
ALTER TABLE `validationlist_validation`
ADD CONSTRAINT `FK_validationlist_validation_validationlist_id` FOREIGN KEY (`validationlist_id`) REFERENCES `validationlist` (`ID`),
ADD CONSTRAINT `FK_validationlist_validation_validation_id` FOREIGN KEY (`validation_id`) REFERENCES `validation` (`ID`);
SET FOREIGN_KEY_CHECKS=1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
