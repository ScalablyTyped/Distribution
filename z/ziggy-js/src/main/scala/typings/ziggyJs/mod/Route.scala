package typings.ziggyJs.mod

import typings.ziggyJs.ziggyJsStrings.DELETE
import typings.ziggyJs.ziggyJsStrings.GET
import typings.ziggyJs.ziggyJsStrings.HEAD
import typings.ziggyJs.ziggyJsStrings.OPTIONS
import typings.ziggyJs.ziggyJsStrings.PATCH
import typings.ziggyJs.ziggyJsStrings.POST
import typings.ziggyJs.ziggyJsStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends js.Object {
  
  var domain: js.UndefOr[Null | String] = js.native
  
  var methods: js.Array[GET | HEAD | POST | PATCH | PUT | OPTIONS | DELETE] = js.native
  
  var uri: String = js.native
}
object Route {
  
  @scala.inline
  def apply(methods: js.Array[GET | HEAD | POST | PATCH | PUT | OPTIONS | DELETE], uri: String): Route = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    
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
    def setMethodsVarargs(value: (GET | HEAD | POST | PATCH | PUT | OPTIONS | DELETE)*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[GET | HEAD | POST | PATCH | PUT | OPTIONS | DELETE]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDomainNull: Self = this.set("domain", null)
  }
}
