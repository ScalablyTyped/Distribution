package typings.zoomist

import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.WheelEvent
import typings.zoomist.anon.ContainerData
import typings.zoomist.anon.Destroy
import typings.zoomist.anon.Drag
import typings.zoomist.anon.El
import typings.zoomist.anon.InEl
import typings.zoomist.anon.Left
import typings.zoomist.anon.Slider
import typings.zoomist.anon.Width
import typings.zoomist.anon.X
import typings.zoomist.zoomistBooleans.`false`
import typings.zoomist.zoomistStrings.$LeftcurlybracketnumberRightcurlybracketPercentsign
import typings.zoomist.zoomistStrings.auto
import typings.zoomist.zoomistStrings.contain
import typings.zoomist.zoomistStrings.cover
import typings.zoomist.zoomistStrings.destroy
import typings.zoomist.zoomistStrings.drag
import typings.zoomist.zoomistStrings.dragEnd
import typings.zoomist.zoomistStrings.dragStart
import typings.zoomist.zoomistStrings.none
import typings.zoomist.zoomistStrings.pinch
import typings.zoomist.zoomistStrings.pinchEnd
import typings.zoomist.zoomistStrings.pinchStart
import typings.zoomist.zoomistStrings.ready
import typings.zoomist.zoomistStrings.reset
import typings.zoomist.zoomistStrings.resize
import typings.zoomist.zoomistStrings.slide
import typings.zoomist.zoomistStrings.slideEnd
import typings.zoomist.zoomistStrings.slideStart
import typings.zoomist.zoomistStrings.update
import typings.zoomist.zoomistStrings.wheel
import typings.zoomist.zoomistStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zoomist", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Zoomist {
    def this(element: Element) = this()
    def this(element: Element, options: ZoomistOptions) = this()
  }
  
  @js.native
  trait Zoomist extends StObject {
    
    var __events__ : Destroy = js.native
    
    var __modules__ : Slider = js.native
    
    def create(url: String): Unit = js.native
    
    var data: ContainerData = js.native
    
    def destroy(): Unit = js.native
    
    var dragging: Boolean = js.native
    
    var element: HTMLElement = js.native
    
    /* Methods */
    def getContainerData(): Width = js.native
    
    def getImageData(): Left = js.native
    
    def getSliderValue(): Double = js.native
    
    def getZoomRation(): Double = js.native
    
    var image: HTMLImageElement = js.native
    
    def init(): Unit = js.native
    
    def mount(): Unit = js.native
    
    var mounted: Boolean = js.native
    
    def move(x: Double, y: Double): Unit = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    def on(event: ready | update | destroy | resize | reset, handler: js.Function0[Unit]): Unit = js.native
    def on(event: pinch | pinchStart | pinchEnd, handler: js.Function1[/* event */ Event, Unit]): Unit = js.native
    def on(
      event: drag | dragEnd | dragStart | slide | slideEnd | slideStart,
      handler: js.Function2[(/* value */ Double) | (/* transform */ X), /* event */ Event, Unit]
    ): Unit = js.native
    @JSName("on")
    def on_wheel(event: wheel, handler: js.Function1[/* event */ WheelEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_zoom(event: zoom, handler: js.Function1[/* ratio */ Double, Unit]): Unit = js.native
    
    var options: ZoomistOptions = js.native
    
    var pinching: Boolean = js.native
    
    var ratio: Double = js.native
    
    def render(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def slideTo(value: Double, isOnlySlide: Boolean): Unit = js.native
    
    def update(): Unit = js.native
    
    var url: String = js.native
    
    var wheeling: Boolean = js.native
    
    var wrapper: HTMLDivElement = js.native
    
    def zoom(ratio: Double): Unit = js.native
    
    def zoomTo(ratio: Double): Unit = js.native
  }
  
  trait ZoomistOptions extends StObject {
    
    var bounds: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[cover | contain | none] = js.undefined
    
    var height: js.UndefOr[auto | $LeftcurlybracketnumberRightcurlybracketPercentsign | Double | `false`] = js.undefined
    
    var maxRatio: js.UndefOr[Double | `false`] = js.undefined
    
    var on: js.UndefOr[Drag] = js.undefined
    
    var pinchable: js.UndefOr[Boolean] = js.undefined
    
    var slider: js.UndefOr[El] = js.undefined
    
    var src: js.UndefOr[String | HTMLImageElement] = js.undefined
    
    var wheelable: js.UndefOr[Boolean] = js.undefined
    
    var zoomRatio: js.UndefOr[Double] = js.undefined
    
    var zoomer: js.UndefOr[InEl] = js.undefined
  }
  object ZoomistOptions {
    
    inline def apply(): ZoomistOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomistOptions]
    }
    
    extension [Self <: ZoomistOptions](x: Self) {
      
      inline def setBounds(value: Boolean): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFill(value: cover | contain | none): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHeight(value: auto | $LeftcurlybracketnumberRightcurlybracketPercentsign | Double | `false`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMaxRatio(value: Double | `false`): Self = StObject.set(x, "maxRatio", value.asInstanceOf[js.Any])
      
      inline def setMaxRatioUndefined: Self = StObject.set(x, "maxRatio", js.undefined)
      
      inline def setOn(value: Drag): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setPinchable(value: Boolean): Self = StObject.set(x, "pinchable", value.asInstanceOf[js.Any])
      
      inline def setPinchableUndefined: Self = StObject.set(x, "pinchable", js.undefined)
      
      inline def setSlider(value: El): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setSrc(value: String | HTMLImageElement): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setWheelable(value: Boolean): Self = StObject.set(x, "wheelable", value.asInstanceOf[js.Any])
      
      inline def setWheelableUndefined: Self = StObject.set(x, "wheelable", js.undefined)
      
      inline def setZoomRatio(value: Double): Self = StObject.set(x, "zoomRatio", value.asInstanceOf[js.Any])
      
      inline def setZoomRatioUndefined: Self = StObject.set(x, "zoomRatio", js.undefined)
      
      inline def setZoomer(value: InEl): Self = StObject.set(x, "zoomer", value.asInstanceOf[js.Any])
      
      inline def setZoomerUndefined: Self = StObject.set(x, "zoomer", js.undefined)
    }
  }
}
