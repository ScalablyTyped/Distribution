package typings.yog2Kernel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CleanCache extends js.Object {
  
  // 清除viewcache
  def cleanCache(): Unit = js.native
}
object CleanCache {
  
  @scala.inline
  def apply(cleanCache: () => Unit): CleanCache = {
    val __obj = js.Dynamic.literal(cleanCache = js.Any.fromFunction0(cleanCache))
    __obj.asInstanceOf[CleanCache]
  }
  
  @scala.inline
  implicit class CleanCacheOps[Self <: CleanCache] (val x: Self) extends AnyVal {
    
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
    def setCleanCache(value: () => Unit): Self = this.set("cleanCache", js.Any.fromFunction0(value))
  }
}
