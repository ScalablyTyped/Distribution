package typings.zeromq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketTypes extends js.Object {
  var dealer: Double = js.native
  var pair: Double = js.native
  var pub: Double = js.native
  var pull: Double = js.native
  var push: Double = js.native
  var rep: Double = js.native
  var req: Double = js.native
  var router: Double = js.native
  var stream: Double = js.native
  var sub: Double = js.native
  var xpub: Double = js.native
  var xrep: Double = js.native
  var xreq: Double = js.native
  var xsub: Double = js.native
}

object SocketTypes {
  @scala.inline
  def apply(
    dealer: Double,
    pair: Double,
    pub: Double,
    pull: Double,
    push: Double,
    rep: Double,
    req: Double,
    router: Double,
    stream: Double,
    sub: Double,
    xpub: Double,
    xrep: Double,
    xreq: Double,
    xsub: Double
  ): SocketTypes = {
    val __obj = js.Dynamic.literal(dealer = dealer.asInstanceOf[js.Any], pair = pair.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rep = rep.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any], xrep = xrep.asInstanceOf[js.Any], xreq = xreq.asInstanceOf[js.Any], xsub = xsub.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTypes]
  }
  @scala.inline
  implicit class SocketTypesOps[Self <: SocketTypes] (val x: Self) extends AnyVal {
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
    def setDealer(value: Double): Self = this.set("dealer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPair(value: Double): Self = this.set("pair", value.asInstanceOf[js.Any])
    @scala.inline
    def setPub(value: Double): Self = this.set("pub", value.asInstanceOf[js.Any])
    @scala.inline
    def setPull(value: Double): Self = this.set("pull", value.asInstanceOf[js.Any])
    @scala.inline
    def setPush(value: Double): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def setRep(value: Double): Self = this.set("rep", value.asInstanceOf[js.Any])
    @scala.inline
    def setReq(value: Double): Self = this.set("req", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouter(value: Double): Self = this.set("router", value.asInstanceOf[js.Any])
    @scala.inline
    def setStream(value: Double): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def setSub(value: Double): Self = this.set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def setXpub(value: Double): Self = this.set("xpub", value.asInstanceOf[js.Any])
    @scala.inline
    def setXrep(value: Double): Self = this.set("xrep", value.asInstanceOf[js.Any])
    @scala.inline
    def setXreq(value: Double): Self = this.set("xreq", value.asInstanceOf[js.Any])
    @scala.inline
    def setXsub(value: Double): Self = this.set("xsub", value.asInstanceOf[js.Any])
  }
  
}

