package typings.zoneJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADDEVENTLISTENERSTR extends js.Object {
  var ADD_EVENT_LISTENER_STR: String = js.native
  var FALSE_STR: String = js.native
  var REMOVE_EVENT_LISTENER_STR: String = js.native
  var TRUE_STR: String = js.native
  var ZONE_SYMBOL_PREFIX: String = js.native
  var eventNames: js.Array[String] = js.native
  var globalSources: js.Any = js.native
  var isBrowser: Boolean = js.native
  var isMix: Boolean = js.native
  var isNode: Boolean = js.native
  var zoneSymbolEventNames: js.Any = js.native
}

object ADDEVENTLISTENERSTR {
  @scala.inline
  def apply(
    ADD_EVENT_LISTENER_STR: String,
    FALSE_STR: String,
    REMOVE_EVENT_LISTENER_STR: String,
    TRUE_STR: String,
    ZONE_SYMBOL_PREFIX: String,
    eventNames: js.Array[String],
    globalSources: js.Any,
    isBrowser: Boolean,
    isMix: Boolean,
    isNode: Boolean,
    zoneSymbolEventNames: js.Any
  ): ADDEVENTLISTENERSTR = {
    val __obj = js.Dynamic.literal(ADD_EVENT_LISTENER_STR = ADD_EVENT_LISTENER_STR.asInstanceOf[js.Any], FALSE_STR = FALSE_STR.asInstanceOf[js.Any], REMOVE_EVENT_LISTENER_STR = REMOVE_EVENT_LISTENER_STR.asInstanceOf[js.Any], TRUE_STR = TRUE_STR.asInstanceOf[js.Any], ZONE_SYMBOL_PREFIX = ZONE_SYMBOL_PREFIX.asInstanceOf[js.Any], eventNames = eventNames.asInstanceOf[js.Any], globalSources = globalSources.asInstanceOf[js.Any], isBrowser = isBrowser.asInstanceOf[js.Any], isMix = isMix.asInstanceOf[js.Any], isNode = isNode.asInstanceOf[js.Any], zoneSymbolEventNames = zoneSymbolEventNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADDEVENTLISTENERSTR]
  }
  @scala.inline
  implicit class ADDEVENTLISTENERSTROps[Self <: ADDEVENTLISTENERSTR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setADD_EVENT_LISTENER_STR(value: String): Self = this.set("ADD_EVENT_LISTENER_STR", value.asInstanceOf[js.Any])
    @scala.inline
    def setFALSE_STR(value: String): Self = this.set("FALSE_STR", value.asInstanceOf[js.Any])
    @scala.inline
    def setREMOVE_EVENT_LISTENER_STR(value: String): Self = this.set("REMOVE_EVENT_LISTENER_STR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTRUE_STR(value: String): Self = this.set("TRUE_STR", value.asInstanceOf[js.Any])
    @scala.inline
    def setZONE_SYMBOL_PREFIX(value: String): Self = this.set("ZONE_SYMBOL_PREFIX", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventNamesVarargs(value: String*): Self = this.set("eventNames", js.Array(value :_*))
    @scala.inline
    def setEventNames(value: js.Array[String]): Self = this.set("eventNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalSources(value: js.Any): Self = this.set("globalSources", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBrowser(value: Boolean): Self = this.set("isBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMix(value: Boolean): Self = this.set("isMix", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNode(value: Boolean): Self = this.set("isNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoneSymbolEventNames(value: js.Any): Self = this.set("zoneSymbolEventNames", value.asInstanceOf[js.Any])
  }
  
}

