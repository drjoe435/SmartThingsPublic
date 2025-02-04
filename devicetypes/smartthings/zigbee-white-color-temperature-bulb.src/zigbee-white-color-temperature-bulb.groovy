/**
 *  Copyright 2017 SmartThings
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 *  ZigBee White Color Temperature Bulb
 *
 *  Author: SmartThings
 *  Date: 2015-09-22
 */

metadata {
	definition(name: "ZigBee White Color Temperature Bulb", namespace: "smartthings", author: "SmartThings", runLocally: true, minHubCoreVersion: '000.019.00012', executeCommandsLocally: true, genericHandler: "Zigbee") {

		capability "Actuator"
		capability "Color Temperature"
		capability "Configuration"
		capability "Health Check"
		capability "Refresh"
		capability "Switch"
		capability "Switch Level"
		capability "Light"

		attribute "colorName", "string"


		// Generic
		fingerprint profileId: "0104", deviceId: "010C", inClusters: "0006, 0008, 0300", deviceJoinName: "Light" //Generic Color Temperature Light

		// ABL
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300", outClusters: "0019", manufacturer: "Samsung Electronics", model: "ABL-LIGHT-Z-001", deviceJoinName: "Juno Connect", mnmn: "Samsung Electronics", vid: "ABL-LIGHT-Z-001" //Wafer
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300", outClusters: "0019", manufacturer: "Juno", model: "ABL-LIGHT-Z-001", deviceJoinName: "Juno Connect", mnmn: "Samsung Electronics", vid: "ABL-LIGHT-Z-001"

		// Samsung LED
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300", outClusters: "0019", manufacturer: "Samsung Electronics", model: "SAMSUNG-ITM-Z-001", deviceJoinName: "Samsung Light", mnmn: "Samsung Electronics", vid: "SAMSUNG-ITM-Z-001" //ITM CCT
		
		// Samsung Korea B2B Marketing
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300", outClusters: "0019", manufacturer: "Samsung Electronics", model: "HAN-LIGHT-Z-001", deviceJoinName: "SamsungB2B Light", mnmn: "SmartThingsCommunity", vid: "c0b88b06-99f7-3781-a5a8-8a66fccf2bae" //Samsung Korea B2B Marketing CCT
		
		// AduroSmart
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 1000", outClusters: "0019", deviceId: "010C", manufacturer: "AduroSmart Eria", model: "AD-ColorTemperature3001", deviceJoinName: "Eria Light" //Eria ZigBee Color Temperature Bulb

		// Aurora/AOne
		fingerprint profileId: "0104", inClusters: "0000, 0004, 0003, 0006, 0008, 0005, 0300, FFFF, FFFF, 1000", outClusters: "0019", manufacturer: "Aurora", model: "TWBulb51AU", deviceJoinName: "Aurora Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-5000K" //Aurora Smart Tuneable White
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300", outClusters: "0019", manufacturer: "Aurora", model: "TWMPROZXBulb50AU", deviceJoinName: "Aurora Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-5000K" //Aurora MPro Smart Tuneable LED
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300", outClusters: "0019", manufacturer: "Aurora", model: "TWStrip50AU", deviceJoinName: "Aurora Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2500K-6000K" //Aurora Tunable Strip Controller
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B05, 1000, FEDC", outClusters: "0019, 000A", manufacturer: "Aurora", model: "TWGU10Bulb50AU", deviceJoinName: "Aurora Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-5000K" //Aurora GU10 Tuneable Smart Lamp
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 1000, FFFF", outClusters: "0019", manufacturer: "Aurora", model: "TWBulb51AU", deviceJoinName: "AOne Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-5000K" //AOne Smart Tuneable GLS Lamp
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 1000, FFFF", outClusters: "0019", manufacturer: "Aurora", model: "TWCLBulb50AU", deviceJoinName: "AOne Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-5000K" //AOne Smart Tuneable Candle Lamp

		//CWD
		// raw description "01 0104 010C 01 0A 0000 0003 0004 0005 0006 0008 0300 0B05 1000 FC82 02 000A 0019"
		fingerprint manufacturer: "CWD", model: "ZB.A806Ecct-A001", deviceJoinName: "CWD Light" //model: "E27 Colour Tuneable", brand: "Collingwood"
		// raw description "01 0104 010C 01 0A 0000 0003 0004 0005 0006 0008 0300 0B05 1000 FC82 02 000A 0019"
		fingerprint manufacturer: "CWD", model: "ZB.A806Bcct-A001", deviceJoinName: "CWD Light" //model: "BC Colour Tuneable", brand: "Collingwood"
		// raw description "01 0104 010C 01 0A 0000 0003 0004 0005 0006 0008 0300 0B05 1000 FC82 02 000A 0019"
		fingerprint manufacturer: "CWD", model: "ZB.M350cct-A001", deviceJoinName: "CWD Light" //model: "GU10 Colour Tuneable", brand: "Collingwood"

		// Commercial Electric
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300", outClusters: "0019", manufacturer: "ETI", model: "Zigbee CCT Downlight", deviceJoinName: "Commercial Light", vid: "generic-color-temperature-bulb-2700K-5000K" //Commercial Electric Can Tunable White

		// Ecosmart
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B05, 1000, FC82", outClusters: "000A, 0019", manufacturer: "The Home Depot", model: "Ecosmart-ZBT-BR30-CCT-Bulb", deviceJoinName: "Ecosmart Light" //Ecosmart Bulb
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B05, 1000, FC82", outClusters: "000A, 0019", manufacturer: "The Home Depot", model: "Ecosmart-ZBT-A19-CCT-Bulb", deviceJoinName: "Ecosmart Light" //Ecosmart Bulb

		// Ikea
		fingerprint manufacturer: "IKEA of Sweden", model: "GUNNARP panel round", deviceJoinName: "IKEA Light" , mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-4000K" //01 0104 010C 01 08 0000 0003 0004 0005 0006 0008 0300 1000 04 0005 0019 0020 1000 //IKEA GUNNARP Lamp
		fingerprint manufacturer: "IKEA of Sweden", model: "LEPTITER Recessed spot light", deviceJoinName: "IKEA Light" , mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-4000K" //01 0104 010C 01 08 0000 0003 0004 0005 0006 0008 0300 1000 04 0005 0019 0020 1000 //IKEA LEPTITER Spotlight
		fingerprint manufacturer: "IKEA of Sweden", model: "TRADFRI bulb E12 WS opal 600lm", deviceJoinName: "IKEA Light" , mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-4000K" //01 0104 010C 01 09 0000 0003 0004 0005 0006 0008 0300 1000 FC7C 04 0005 0019 0020 1000 //IKEA TRÅDFRI LED Bulb
		fingerprint manufacturer: "IKEA of Sweden", model: "TRADFRI bulb E14 WS 470lm", deviceJoinName: "IKEA Light" , mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-4000K" //01 0104 010C 01 08 0000 0003 0004 0005 0006 0008 0300 1000 04 0005 0019 0020 1000 //IKEA TRÅDFRI LED Bulb
		fingerprint manufacturer: "IKEA of Sweden", model: "TRADFRI bulb E14 WS opal 600lm", deviceJoinName: "IKEA Light" , mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-4000K" //01 0104 010C 01 09 0000 0003 0004 0005 0006 0008 0300 1000 FC7C 04 0005 0019 0020 1000 //IKEA TRÅDFRI LED Bulb
		fingerprint manufacturer: "IKEA of Sweden", model: "TRADFRI bulb E26 WS clear 806lm", deviceJoinName: "IKEA Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-4000K" // raw desc: 01 0104 010C 01 08 0000 0003 0004 0005 0006 0008 0300 1000 04 0005 0019 0020 1000 //IKEA TRÅDFRI LED Bulb
		fingerprint manufacturer: "IKEA of Sweden", model: "TRADFRI bulb E27 WS clear 806lm", deviceJoinName: "IKEA Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-4000K" // raw desc: 01 0104 010C 01 08 0000 0003 0004 0005 0006 0008 0300 1000 04 0005 0019 0020 1000 //IKEA TRÅDFRI LED Bulb
		fingerprint manufacturer: "IKEA of Sweden", model: "TRADFRI bulb E26 WS opal 1000lm", deviceJoinName: "IKEA Light" , mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-4000K" //01 0104 010C 01 09 0000 0003 0004 0005 0006 0008 0300 1000 FC7C 04 0005 0019 0020 1000 //IKEA TRÅDFRI LED Bulb
		fingerprint manufacturer: "IKEA of Sweden", model: "TRADFRI bulb E27 WS opal 1000lm", deviceJoinName: "IKEA Light" , mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-4000K" //01 0104 010C 01 09 0000 0003 0004 0005 0006 0008 0300 1000 FC7C 04 0005 0019 0020 1000 //IKEA TRÅDFRI LED Bulb

		// INGENIUM
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 1000", outClusters: "0019", manufacturer: "Megaman", model: "Z3-ColorTemperature", deviceJoinName: "INGENIUM Light" //INGENIUM ZB Color Temperature Light

		// Innr
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 1000", outClusters: "0019", manufacturer: "innr", model: "RB 248 T", deviceJoinName: "Innr Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-5000K" //Innr Smart Candle Comfort
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 1000", outClusters: "0019", manufacturer: "innr", model: "RB 278 T", deviceJoinName: "Innr Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-5000K" //Innr Smart Bulb Comfort
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 1000", outClusters: "0019", manufacturer: "innr", model: "RS 228 T", deviceJoinName: "Innr Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-5000K" //Innr Smart Spot Comfort

		// OSRAM/SYLVANIA (LEDVANCE)
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B04, FC0F", outClusters: "0019", manufacturer: "OSRAM", model: "LIGHTIFY BR Tunable White", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart BR30 Tunable White
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B04, FC0F", outClusters: "0019", manufacturer: "OSRAM", model: "LIGHTIFY RT Tunable White", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart RT5/6 Tunable White
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B04, FC0F", outClusters: "0019", manufacturer: "OSRAM", model: "Classic A60 TW", deviceJoinName: "OSRAM Light" //OSRAM SMART+ LED Classic A60 Tunable White
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B04, FC0F", outClusters: "0019", manufacturer: "OSRAM", model: "LIGHTIFY A19 Tunable White", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart A19 Tunable White
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B04, FC0F", outClusters: "0019", manufacturer: "OSRAM", model: "Classic B40 TW - LIGHTIFY", deviceJoinName: "OSRAM Light" //OSRAM SMART+ Classic B40 Tunable White
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B04, 0B05, FC01, FC08", outClusters: "0003, 0019", manufacturer: "LEDVANCE", model: "A19 TW 10 year", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart 10Y A19 TW
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B04, FC0F", outClusters: "0019", manufacturer: "OSRAM", model: "LIGHTIFY Conv Under Cabinet TW", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart Convertible Under Cabinet
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B04, FC0F", outClusters: "0019", manufacturer: "OSRAM", model: "ColorstripRGBW", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart Convertible Under Cabinet
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, FC0F", outClusters: "0019", manufacturer: "OSRAM", model: "LIGHTIFY Edge-lit Flushmount TW", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart Edge-lit Flushmount TW
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B05, FC01", outClusters: "0003, 0019", manufacturer: "LEDVANCE", model: "MR16 TW", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart MR16 Tunable White
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B04, FC0F", outClusters: "0019", manufacturer: "OSRAM", model: "LIGHTIFY Surface TW", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart Surface Tunable White
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, FC0F", outClusters: "0019", manufacturer: "OSRAM", model: "LIGHTIFY Under Cabinet TW", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart Under Cabinet TW
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B05, FC01", outClusters: "0019", manufacturer: "LEDVANCE", model: "BR30 TW", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart+ Adustable White BR30
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B05, FC01", outClusters: "0019", manufacturer: "LEDVANCE", model: "RT TW", deviceJoinName: "SYLVANIA Light" //SYLVANIA Smart+ Adustable White RT5/6
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, FC0F", outClusters: "0019", manufacturer: "OSRAM", model: "LIGHTIFY Edge-lit flushmount", deviceJoinName: "SYLVANIA Light", mnmn: "SmartThings", vid: "generic-color-temperature-ceiling-light-2700K-6500K" //SYLVANIA SMART+ Flush Mount

		// Leedarson
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B05, 1000, FEDC", outClusters: "000A, 0019", manufacturer: "Smarthome", model: "S111-202A", deviceJoinName: "Leedarson Light" //Leedarson Tunable White Bulb A19

		// LINKIND
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0B05, 1000, FC82", outClusters: "000A, 0019", manufacturer: "lk", model: "ZBT-CCTLight-GLS0108", deviceJoinName: "Linkind Light" //Linkid Tunable A19 Bulb

		// Muller Licht Tint
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 1000", outClusters: "0019", manufacturer: "MLI", model: "ZBT-ColorTemperature", deviceJoinName: "Tint Light" //Müller Licht Tint White Bulb

		// Sengled
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0702, 0B05", outClusters: "0019", manufacturer: "sengled", model: "Z01-A19NAE26", deviceJoinName: "Sengled Light" //Sengled Element Plus
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0702, 0B05", outClusters: "0019", manufacturer: "sengled", model: "Z01-A191AE26W", deviceJoinName: "Sengled Light" //Sengled Element Plus
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0702, 0B05", outClusters: "0019", manufacturer: "sengled", model: "Z01-A60EAB22", deviceJoinName: "Sengled Light" //Sengled Element Plus
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 0702, 0B05", outClusters: "0019", manufacturer: "sengled", model: "Z01-A60EAE27", deviceJoinName: "Sengled Light" //Sengled Element Plus

		// Third Reality
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300", outClusters: "0019", manufacturer: "Third Reality, Inc", model: "3RSL011Z", deviceJoinName: "RealityLight Light" //RealityLight
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300", outClusters: "0019", manufacturer: "Third Reality, Inc", model: "3RSL012Z", deviceJoinName: "RealityLight Light" //RealityLight

		// Ajax Online
		fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0008, 0300, 1000", outClusters: "0019", manufacturer: "Ajax Online", model: "CCT", deviceJoinName: "Ajax Light", mnmn: "SmartThings", vid: "generic-color-temperature-bulb-2200K-6500K" // Ajax Online Filament Bulb
	}

	// UI tile definitions
	tiles(scale: 2) {
		multiAttributeTile(name: "switch", type: "lighting", width: 6, height: 4, canChangeIcon: true) {
			tileAttribute("device.switch", key: "PRIMARY_CONTROL") {
				attributeState "on", label: '${name}', action: "switch.off", icon: "st.switches.light.on", backgroundColor: "#00A0DC", nextState: "turningOff"
				attributeState "off", label: '${name}', action: "switch.on", icon: "st.switches.light.off", backgroundColor: "#ffffff", nextState: "turningOn"
				attributeState "turningOn", label: '${name}', action: "switch.off", icon: "st.switches.light.on", backgroundColor: "#00A0DC", nextState: "turningOff"
				attributeState "turningOff", label: '${name}', action: "switch.on", icon: "st.switches.light.off", backgroundColor: "#ffffff", nextState: "turningOn"
			}
			tileAttribute("device.level", key: "SLIDER_CONTROL") {
				attributeState "level", action: "switch level.setLevel"
			}
		}

		standardTile("refresh", "device.refresh", inactiveLabel: false, decoration: "flat", width: 2, height: 2) {
			state "default", label: "", action: "refresh.refresh", icon: "st.secondary.refresh"
		}

		controlTile("colorTempSliderControl", "device.colorTemperature", "slider", width: 4, height: 2, inactiveLabel: false, range: "(2700..6500)") {
			state "colorTemperature", action: "color temperature.setColorTemperature"
		}
		valueTile("colorName", "device.colorName", inactiveLabel: false, decoration: "flat", width: 2, height: 2) {
			state "colorName", label: '${currentValue}'
		}

		main(["switch"])
		details(["switch", "colorTempSliderControl", "colorName", "refresh"])
	}
}

// Globals
private getMOVE_TO_COLOR_TEMPERATURE_COMMAND() { 0x0A }

private getCOLOR_CONTROL_CLUSTER() { 0x0300 }

private getATTRIBUTE_COLOR_TEMPERATURE() { 0x0007 }

// Parse incoming device messages to generate events
def parse(String description) {
	log.debug "description is $description"
	def event = zigbee.getEvent(description)
	if (event) {
		if (event.name == "level" && event.value == 0) {
		} else {
			if (event.name == "colorTemperature") {
				setGenericName(event.value)
			}
			sendEvent(event)
		}
	} else {
		def cluster = zigbee.parse(description)

		if (cluster && cluster.clusterId == 0x0006 && cluster.command == 0x07) {
			if (cluster.data[0] == 0x00) {
				log.debug "ON/OFF REPORTING CONFIG RESPONSE: " + cluster
				sendEvent(name: "checkInterval", value: 60 * 12, displayed: false, data: [protocol: "zigbee", hubHardwareId: device.hub.hardwareID])
			} else {
				log.warn "ON/OFF REPORTING CONFIG FAILED- error code:${cluster.data[0]}"
			}
		} else {
			log.warn "DID NOT PARSE MESSAGE for description : $description"
			log.debug "${cluster}"
		}
	}
}

def off() {
	zigbee.off()
}

def on() {
	zigbee.on()
}

def setLevel(value, rate = null) {
	zigbee.setLevel(value)
}

/**
 * PING is used by Device-Watch in attempt to reach the Device
 * */
def ping() {
	return zigbee.onOffRefresh()
}

def refresh() {
	zigbee.onOffRefresh() +
			zigbee.levelRefresh() +
			zigbee.colorTemperatureRefresh() +
			zigbee.onOffConfig(0, 300) +
			zigbee.levelConfig()
}

def configure() {
	log.debug "Configuring Reporting and Bindings."
	// Device-Watch allows 2 check-in misses from device + ping (plus 1 min lag time)
	// enrolls with default periodic reporting until newer 5 min interval is confirmed
	sendEvent(name: "checkInterval", value: 2 * 10 * 60 + 1 * 60, displayed: false, data: [protocol: "zigbee", hubHardwareId: device.hub.hardwareID])

	// OnOff minReportTime 0 seconds, maxReportTime 5 min. Reporting interval if no activity
	refresh()
}

def setColorTemperature(value) {
	value = value as Integer
	def tempInMired = Math.round(1000000 / value)
	def finalHex = zigbee.swapEndianHex(zigbee.convertToHexString(tempInMired, 4))

	List cmds = []
	if (device.getDataValue("manufacturer") == "sengled" && device.getDataValue("model") == "Z01-A19NAE26") {
		// Sengled Element Plus will ignore the command if the transition time is 0x0000
		cmds << zigbee.command(COLOR_CONTROL_CLUSTER, MOVE_TO_COLOR_TEMPERATURE_COMMAND, "$finalHex 0100")
	} else {
		cmds << zigbee.command(COLOR_CONTROL_CLUSTER, MOVE_TO_COLOR_TEMPERATURE_COMMAND, "$finalHex 0000")
	}
	cmds << zigbee.readAttribute(COLOR_CONTROL_CLUSTER, ATTRIBUTE_COLOR_TEMPERATURE)
	cmds
}

//Naming based on the wiki article here: http://en.wikipedia.org/wiki/Color_temperature
def setGenericName(value) {
	if (value != null) {
		def genericName = "White"
		if (value < 3300) {
			genericName = "Soft White"
		} else if (value < 4150) {
			genericName = "Moonlight"
		} else if (value <= 5000) {
			genericName = "Cool White"
		} else if (value >= 5000) {
			genericName = "Daylight"
		}
		sendEvent(name: "colorName", value: genericName)
	}
}

def installed() {
	if (((device.getDataValue("manufacturer") == "MRVL") && (device.getDataValue("model") == "MZ100"))
			|| (device.getDataValue("manufacturer") == "OSRAM SYLVANIA")
			|| (device.getDataValue("manufacturer") == "OSRAM")
			|| (device.getDataValue("manufacturer") == "sengled")
			|| (device.getDataValue("manufacturer") == "Third Reality, Inc")) {
		if ((device.currentState("level")?.value == null) || (device.currentState("level")?.value == 0)) {
			sendEvent(name: "level", value: 100)
		}
	}
}
