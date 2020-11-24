package typings.zeditUpf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Controller[S /* <: js.Object */] extends js.Object {
  
  /**
    * controller function for your patcher's settings tab.
    * This is where you put any extra data binding/functions
    * that you need to access through angular on the settings tab.
    *
    * @todo what is $scope?
    */
  var controller: js.UndefOr[js.Function1[/* $scope */ js.Any, Unit]] = js.native
  
  /**
    * Default settings for your patcher.
    */
  var defaultSettings: PatchFileName with S = js.native
  
  /**
    * If you set hide to true the settings tab will not be displayed
    *
    * @default false
    */
  var hide: js.UndefOr[Boolean] = js.native
  
  /**
    * The label is what gets displayed as the settings tab's label
    */
  var label: String = js.native
  
  /**
    * URL to the HTML template to use for the settings tab.
    * You'll want to use the `patcherUrl` global in this URL.
    *
    * @example `${patcherUrl}/partials/settings.html`
    */
  var templateUrl: String = js.native
}
object Controller {
  
  @scala.inline
  def apply[S /* <: js.Object */](defaultSettings: PatchFileName with S, label: String, templateUrl: String): Controller[S] = {
    val __obj = js.Dynamic.literal(defaultSettings = defaultSettings.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller[S]]
  }
  
  @scala.inline
  implicit class ControllerOps[Self <: Controller[_], S /* <: js.Object */] (val x: Self with Controller[S]) extends AnyVal {
    
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
    def setDefaultSettings(value: PatchFileName with S): Self = this.set("defaultSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setController(value: /* $scope */ js.Any => Unit): Self = this.set("controller", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
  }
}
