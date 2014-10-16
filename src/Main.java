import analytics.base.RawSignal;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import groovy.util.XmlSlurper;
import groovy.util.slurpersupport.GPathResult;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.lang.System.out;

public class Main {

    private static XStream xstream = new XStream(new JettisonMappedXmlDriver());

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        String status = "StatusJSONImpl{createdAt=Fri Oct 10 21:06:30 EDT 2014, id=520742199693438976, text='RT @SNFonNBC: After today, the @dallascowboys are 4-1 for the first time since 2008. #FootballNightInAmerica http://t.co/BvssPy1TdY', source='<a href=\"http://www.socialbusinessindex.com\" rel=\"nofollow\">Social Business Index</a>', isTruncated=false, inReplyToStatusId=-1, inReplyToUserId=-1, isFavorited=false, isRetweeted=true, favoriteCount=0, inReplyToScreenName='null', geoLocation=null, place=null, retweetCount=90, isPossiblySensitive=false, isoLanguageCode='null', lang='en', contributorsIDs=[], retweetedStatus=StatusJSONImpl{createdAt=Sun Oct 05 19:56:41 EDT 2014, id=518912691738779649, text='After today, the @dallascowboys are 4-1 for the first time since 2008. #FootballNightInAmerica http://t.co/BvssPy1TdY', source='<a href=\"http://twitter.com\" rel=\"nofollow\">Twitter Web Client</a>', isTruncated=false, inReplyToStatusId=-1, inReplyToUserId=-1, isFavorited=false, isRetweeted=true, favoriteCount=70, inReplyToScreenName='null', geoLocation=null, place=null, retweetCount=90, isPossiblySensitive=false, isoLanguageCode='null', lang='en', contributorsIDs=[], retweetedStatus=null, userMentionEntities=[UserMentionEntityJSONImpl{name='Dallas Cowboys', screenName='dallascowboys', id=8824902}], urlEntities=[], hashtagEntities=[HashtagEntityJSONImpl{text='FootballNightInAmerica'}], mediaEntities=[MediaEntityJSONImpl{id=518912690920906752, url=http://t.co/BvssPy1TdY, mediaURL=http://pbs.twimg.com/media/BzOMV9PIYAAbLuF.png, mediaURLHttps=https://pbs.twimg.com/media/BzOMV9PIYAAbLuF.png, expandedURL=http://twitter.com/SNFonNBC/status/518912691738779649/photo/1, displayURL='pic.twitter.com/BvssPy1TdY', sizes={0=Size{width=150, height=150, resize=101}, 1=Size{width=340, height=173, resize=100}, 2=Size{width=600, height=305, resize=100}, 3=Size{width=801, height=408, resize=100}}, type=photo}], symbolEntities=[], currentUserRetweetId=-1, user=UserJSONImpl{id=167155452, name='SNF on NBC', screenName='SNFonNBC', location='NBC', description='The official Twitter of Sunday Night Football on NBC. \n" +
                "Behind the Scenes of SNF & Football Night in America                         #SNF', isContributorsEnabled=false, profileImageUrl='http://pbs.twimg.com/profile_images/378800000678290778/10ef72aa63f76ce37521ddf71b7eaaa6_normal.jpeg', profileImageUrlHttps='https://pbs.twimg.com/profile_images/378800000678290778/10ef72aa63f76ce37521ddf71b7eaaa6_normal.jpeg', url='http://t.co/kEMqO1D0oQ', isProtected=false, followersCount=261898, status=null, profileBackgroundColor='131516', profileTextColor='333333', profileLinkColor='009999', profileSidebarFillColor='EFEFEF', profileSidebarBorderColor='FFFFFF', profileUseBackgroundImage=true, showAllInlineMedia=false, friendsCount=2657, createdAt=Thu Jul 15 18:08:48 EDT 2010, favouritesCount=450, utcOffset=-18000, timeZone='Quito', profileBackgroundImageUrl='http://pbs.twimg.com/profile_background_images/453657489783808000/HzYFbXaw.jpeg', profileBackgroundImageUrlHttps='https://pbs.twimg.com/profile_background_images/453657489783808000/HzYFbXaw.jpeg', profileBackgroundTiled=true, lang='en', statusesCount=19755, isGeoEnabled=true, isVerified=true, translator=false, listedCount=3104, isFollowRequestSent=false}}, userMentionEntities=[UserMentionEntityJSONImpl{name='SNF on NBC', screenName='SNFonNBC', id=167155452}, UserMentionEntityJSONImpl{name='Dallas Cowboys', screenName='dallascowboys', id=8824902}], urlEntities=[], hashtagEntities=[HashtagEntityJSONImpl{text='FootballNightInAmerica'}], mediaEntities=[MediaEntityJSONImpl{id=518912690920906752, url=http://t.co/BvssPy1TdY, mediaURL=http://pbs.twimg.com/media/BzOMV9PIYAAbLuF.png, mediaURLHttps=https://pbs.twimg.com/media/BzOMV9PIYAAbLuF.png, expandedURL=http://twitter.com/SNFonNBC/status/518912691738779649/photo/1, displayURL='pic.twitter.com/BvssPy1TdY', sizes={0=Size{width=150, height=150, resize=101}, 1=Size{width=340, height=173, resize=100}, 2=Size{width=600, height=305, resize=100}, 3=Size{width=801, height=408, resize=100}}, type=photo}], symbolEntities=[], currentUserRetweetId=-1, user=UserJSONImpl{id=181096781, name='dummy', screenName='mysocialtest', location='', description='', isContributorsEnabled=false, profileImageUrl='http://abs.twimg.com/sticky/default_profile_images/default_profile_5_normal.png', profileImageUrlHttps='https://abs.twimg.com/sticky/default_profile_images/default_profile_5_normal.png', url='null', isProtected=false, followersCount=1, status=null, profileBackgroundColor='C0DEED', profileTextColor='333333', profileLinkColor='0084B4', profileSidebarFillColor='DDEEF6', profileSidebarBorderColor='C0DEED', profileUseBackgroundImage=true, showAllInlineMedia=false, friendsCount=6, createdAt=Sat Aug 21 03:44:28 EDT 2010, favouritesCount=0, utcOffset=-1, timeZone='null', profileBackgroundImageUrl='http://abs.twimg.com/images/themes/theme1/bg.png', profileBackgroundImageUrlHttps='https://abs.twimg.com/images/themes/theme1/bg.png', profileBackgroundTiled=false, lang='en', statusesCount=3, isGeoEnabled=false, isVerified=false, translator=false, listedCount=0, isFollowRequestSent=false}}";

        Type type = new Type();
        RawSignal raw = new RawSignal();

        raw.setObject(status);
        raw.setId("520742199693438976" + "TWITTER"); // number taken from object
        raw.setService("TWITTER");
        raw.setVersion(1);
        raw.setMapper("TwitterMapper");
        raw.setAccountId("0");
        raw.setType(type);
        raw.setTimeBucket("1000000");

        String result = xstream.toXML(raw);
        out.println("******** SERIALIZED RAW STRING: \n" + result);

        Object deserialized = xstream.fromXML(result);
        out.println("******** DESERIALIZED RAW: \n" + deserialized);
        out.println("******** DESERIALIZED RAW CLASS: \n" + deserialized.getClass().getName());


        // *********** YOUTUBE DECODING EXAMPLES *******************

        String rawYoutube = new String(readAllBytes(get("src/yt/WaltDisneyStudiosAUVIDEORza0YVICquYYOUTUBE")));

        Object youtube1 = xstream.fromXML(rawYoutube);
        out.println("******** DESERIALIZED (1) YOUTUBE RAW: \n" + youtube1);

        String rawYoutube2 = new String(readAllBytes(get("src/yt/nravideosVIDEOWkrStEe3H0UYOUTUBE")));
        Object youtube2 = xstream.fromXML(rawYoutube2);
        out.println("******** DESERIALIZED (2) YOUTUBE RAW: \n" + youtube2);


        // ********* XML PARSING
        XmlSlurper xmlSlurper = new XmlSlurper();
        for (Object deserializedRaw : Arrays.asList(youtube1, youtube2)) {
            String xml = ((RawSignal) deserializedRaw).getObject().toString();

//          GPathResult parsedXml = xmlSlurper.parse(xml); //not working - parsing crappy chars

            GPathResult parsed = xmlSlurper.parse(new ByteArrayInputStream(xml.getBytes("utf-8")));
            out.print("*********** PARSED XML: \n " + parsed);
        }
    }
}
