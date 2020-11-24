package typings.ziggyJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ziggyJs.ziggyJsStrings.http
import typings.ziggyJs.ziggyJsStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var baseDomain: String = js.native
  
  var basePort: js.UndefOr[Double | Null] = js.native
  
  var baseProtocol: http | https = js.native
  
  var baseUrl: String = js.native
  
  var defaultParameters: StringDictionary[String | Double] = js.native
  
  var namedRoutes: StringDictionary[Route] = js.native
}
object Config {
  
  @scala.inline
  def apply(
    baseDomain: String,
    baseProtocol: http | https,
    baseUrl: String,
    defaultParameters: StringDictionary[String | Double],
    namedRoutes: StringDictionary[Route]
  ): Config = {
    val __obj = js.Dynamic.literal(baseDomain = baseDomain.asInstanceOf[js.Any], baseProtocol = baseProtocol.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], defaultParameters = defaultParameters.asInstanceOf[js.Any], namedRoutes = namedRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setBaseDomain(value: String): Self = this.set("baseDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseProtocol(value: http | https): Self = this.set("baseProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultParameters(value: StringDictionary[String | Double]): Self = this.set("defaultParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRoutes(value: StringDictionary[Route]): Self = this.set("namedRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePort(value: Double): Self = this.set("basePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePort: Self = this.set("basePort", js.undefined)
    
    @scala.inline
    def setBasePortNull: Self = this.set("basePort", null)
  }
}
