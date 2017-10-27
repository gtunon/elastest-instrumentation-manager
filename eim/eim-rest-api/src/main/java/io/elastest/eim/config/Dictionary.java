package io.elastest.eim.config;

public class Dictionary {
		
	
	//PROPERTIES
	
	public static String PROPERTY_MONGODB_HOST = "mongoDB.host";
	
	public static String PROPERTY_PUBLICKEY_LOCATION = "publickey.location";
	public static String PROPERTY_TEMPLATES_SSH_PLAYBOOK = "templates.ssh.playbook";
	public static String PROPERTY_TEMPLATES_PLAYBOOK_JOKER = "templates.playbook.joker";
	public static String PROPERTY_TEMPLATES_USER_JOKER = "templates.user.joker";
	public static String PROPERTY_TEMPLATES_SCRIPT_JOKER_PLAYBOOK = "templates.script.joker.playbook";
	public static String PROPERTY_TEMPLATES_SCRIPT_JOKER_CONFIG = "templates.script.joker.config";
	public static String PROPERTY_TEMPLATES_SSH_EXECUTION_PLAYBOOK_PREFIX = "templates.ssh.execution_playbook_prefix";
	public static String PROPERTY_TEMPLATES_SSH_EXECUTIONPATH = "templates.ssh.executionPath";
	public static String PROPERTY_TEMPLATES_SSH_LAUNCHER = "templates.ssh.launcher";
	public static String PROPERTY_TEMPLATES_SSH_EXECUTION_LAUNCHER_PREFIX= "templates.ssh.execution_launcher_prefix";

	public static String PROPERTY_TEMPLATES_SSH_HOSTS_FOLDER = "templates.ssh.hostsFolder";
	
	public static String PROPERTY_TEMPLATES_BEATS_PLAYBOOKPATH = "templates.beats.playbookPath";
	public static String PROPERTY_TEMPLATES_BEATS_INSTALL_PLAYBOOK = "templates.beats.install.playbook";
	public static String PROPERTY_TEMPLATES_BEATS_REMOVE_PLAYBOOK = "templates.beats.remove.playbook";
	public static String PROPERTY_TEMPLATES_BEATS_INSTALL_EXECUTION_PLAYBOOK_PREFIX = "templates.beats.install.execution_playbook_prefix";
	public static String PROPERTY_TEMPLATES_BEATS_REMOVE_EXECUTION_PLAYBOOK_PREFIX = "templates.beats.remove.execution_playbook_prefix";
	public static String PROPERTY_TEMPLATES_BEATS_EXECUTIONPATH = "templates.beats.executionPath";
	public static String PROPERTY_TEMPLATES_BEATS_INSTALL_LAUNCHER = "templates.beats.install.launcher";
	public static String PROPERTY_TEMPLATES_BEATS_REMOVE_LAUNCHER = "templates.beats.remove.launcher";
	public static String PROPERTY_TEMPLATES_BEATS_INSTALL_EXECUTION_LAUNCHER_PREFIX = "templates.beats.install.execution_launcher_prefix";
	public static String PROPERTY_TEMPLATES_BEATS_REMOVE_EXECUTION_LAUNCHER_PREFIX = "templates.beats.remove.execution_launcher_prefix";
	public static String PROPERTY_TEMPLATES_BEATS_JOKER_LOGSTASH_IP = "templates.beats.joker.logstaship";
	public static String PROPERTY_TEMPLATES_BEATS_JOKER_LOGSTASH_PORT = "templates.beats.joker.logstashport";

	public static String PROPERTY_EXECUTION_LOGS_PATH = "execution.logs.path";
	public static String PROPERTY_EXECUTION_LOGS_SSH_PREFIX = "execution.logs.ssh.prefix";
	public static String PROPERTY_EXECUTION_LOGS_BEATS_PREFIX = "execution.logs.beats.prefix";

	public static String PROPERTY_LOGGING_FILE = "logging.file";
	
	// USED TO INSTALL/REMOVE FEATURES IN SUT
	public static String INSTALL = "install";
	public static String REMOVE = "remove";
	

}
