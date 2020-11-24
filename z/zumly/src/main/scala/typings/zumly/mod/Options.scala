package typings.zumly.mod

import typings.std.Record
import typings.zumly.anon.Cover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  // Activate debug notifications
  var debug: js.UndefOr[Boolean] = js.native
  
  // First rendered view name
  var initialView: String = js.native
  
  // Mount DOM Element
  var mount: String = js.native
  
  // Custom transitions
  var transitions: js.UndefOr[Cover] = js.native
  
  // Store of all view objects
  var views: Record[String, WithRender | String] = js.native
}
object Options {
  
  @scala.inline
  def apply(initialView: String, mount: String, views: Record[String, WithRender | String]): Options = {
    val __obj = js.Dynamic.literal(initialView = initialView.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setInitialView(value: String): Self = this.set("initialView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMount(value: String): Self = this.set("mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViews(value: Record[String, WithRender | String]): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setTransitions(value: Cover): Self = this.set("transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
  }
}
