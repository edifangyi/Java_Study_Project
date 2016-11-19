var MM_contentVersion = 7;
var plugin = (navigator.mimeTypes && navigator.mimeTypes["application/x-shockwave-flash"]) ? navigator.mimeTypes["application/x-shockwave-flash"].enabledPlugin : 0;
if ( plugin ) {
                var words = navigator.plugins["Shockwave Flash"].description.split(" ");
                for (var i = 0; i < words.length; ++i)
                {
                if (isNaN(parseInt(words[i])))
                continue;
                var MM_PluginVersion = words[i]; 
                }
        var MM_FlashCanPlay = MM_PluginVersion >= MM_contentVersion;
}
else if (navigator.userAgent && navigator.userAgent.indexOf("MSIE")>=0 
   && (navigator.appVersion.indexOf("Win") != -1)) {
        document.write('<SCR' + 'IPT LANGUAGE=VBScript\> \n'); //FS hide this from IE4.5 Mac by splitting the tag
        document.write('on error resume next \n');
        document.write('MM_FlashCanPlay = ( IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash." & MM_contentVersion)))\n');
        document.write('</SCR' + 'IPT\> \n');
}


function CreateFlashCode(swfSrc, w, h, bg, wmode, flashVars) {
        if ( MM_FlashCanPlay ) {
                document.write('<object width="'+ w +'" height="'+ h +'" classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,0,0">');
                document.write('<param name="movie" value="'+ swfSrc +'" />');
                document.write('<param name="quality" value="high" />');
                document.write('<param name="bgcolor" value="'+ bg +'" />');
                document.write('<param name="wmode" value="'+ wmode +'" />');
                document.write('<param name="FlashVars" value="'+ flashVars +'" />');
                document.write('<embed src="'+ swfSrc +'" FlashVars="'+ flashVars +'"  wmode="'+ wmode +'" quality="high" bgcolor="'+ bg +'"  width="'+ w +'" height="'+ h +'" pluginspage="http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash" type="application/x-shockwave-flash" />');
                document.write('</object>');
        }
}