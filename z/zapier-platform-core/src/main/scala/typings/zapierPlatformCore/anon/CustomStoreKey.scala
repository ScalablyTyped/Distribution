package typings.zapierPlatformCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomStoreKey extends js.Object {
  
  var customStoreKey: js.UndefOr[String] = js.native
}
object CustomStoreKey {
  
  @scala.inline
  def apply(): CustomStoreKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomStoreKey]
  }
  
  @scala.inline
  implicit class CustomStoreKeyOps[Self <: CustomStoreKey] (val x: Self) extends AnyVal {
    
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
    def setCustomStoreKey(value: String): Self = this.set("customStoreKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomStoreKey: Self = this.set("customStoreKey", js.undefined)
  }
}
