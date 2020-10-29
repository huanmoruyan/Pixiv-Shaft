package ceui.lisa.models;


public class Preset {

    /**
     * profile_presets : {"addresses":[{"id":1,"name":"北海道","is_global":false},{"id":2,"name":"青森县","is_global":false},{"id":3,"name":"岩手县","is_global":false},{"id":4,"name":"宮城县","is_global":false},{"id":5,"name":"秋田县","is_global":false},{"id":6,"name":"山形县","is_global":false},{"id":7,"name":"福岛县","is_global":false},{"id":8,"name":"茨城县","is_global":false},{"id":9,"name":"栃木县","is_global":false},{"id":10,"name":"群馬县","is_global":false},{"id":11,"name":"埼玉县","is_global":false},{"id":12,"name":"千叶县","is_global":false},{"id":13,"name":"東京都","is_global":false},{"id":14,"name":"神奈川县","is_global":false},{"id":15,"name":"新潟县","is_global":false},{"id":16,"name":"富山县","is_global":false},{"id":17,"name":"石川县","is_global":false},{"id":18,"name":"福井县","is_global":false},{"id":19,"name":"山梨县","is_global":false},{"id":20,"name":"長野县","is_global":false},{"id":21,"name":"岐阜县","is_global":false},{"id":22,"name":"靜冈县","is_global":false},{"id":23,"name":"爱知县","is_global":false},{"id":24,"name":"三重县","is_global":false},{"id":25,"name":"滋賀县","is_global":false},{"id":26,"name":"京都都","is_global":false},{"id":27,"name":"大阪府","is_global":false},{"id":28,"name":"兵库县","is_global":false},{"id":29,"name":"奈良县","is_global":false},{"id":30,"name":"和歌山县","is_global":false},{"id":31,"name":"鸟取县","is_global":false},{"id":32,"name":"岛根县","is_global":false},{"id":33,"name":"冈山县","is_global":false},{"id":34,"name":"广岛县","is_global":false},{"id":35,"name":"山口县","is_global":false},{"id":36,"name":"德岛县","is_global":false},{"id":37,"name":"香川县","is_global":false},{"id":38,"name":"愛媛县","is_global":false},{"id":39,"name":"高知县","is_global":false},{"id":40,"name":"福冈县","is_global":false},{"id":41,"name":"佐賀县","is_global":false},{"id":42,"name":"長崎县","is_global":false},{"id":43,"name":"熊本县","is_global":false},{"id":44,"name":"大分县","is_global":false},{"id":45,"name":"宮崎县","is_global":false},{"id":46,"name":"鹿儿岛县","is_global":false},{"id":47,"name":"沖绳县","is_global":false},{"id":48,"name":"国际","is_global":true}],"countries":[{"code":"IS","name":"Iceland"},{"code":"IE","name":"Ireland"},{"code":"AZ","name":"Azerbaijan"},{"code":"AF","name":"Afghanistan"},{"code":"US","name":"United States"},{"code":"VI","name":"Virgin Islands, U.S."},{"code":"AS","name":"American Samoa"},{"code":"UM","name":"United States Minor Outlying Islands"},{"code":"AE","name":"United Arab Emirates"},{"code":"DZ","name":"Algeria"},{"code":"AR","name":"Argentina"},{"code":"AW","name":"Aruba"},{"code":"AL","name":"Albania"},{"code":"AM","name":"Armenia"},{"code":"AI","name":"Anguilla"},{"code":"AO","name":"Angola"},{"code":"AG","name":"Antigua and Barbuda"},{"code":"AD","name":"Andorra"},{"code":"YE","name":"Yemen"},{"code":"GB","name":"United Kingdom"},{"code":"IO","name":"British Indian Ocean Territory"},{"code":"VG","name":"Virgin Islands, British"},{"code":"IL","name":"Israel"},{"code":"IT","name":"Italy"},{"code":"IQ","name":"Iraq"},{"code":"IR","name":"Iran, Islamic Republic of"},{"code":"IN","name":"India"},{"code":"ID","name":"Indonesia"},{"code":"UG","name":"Uganda"},{"code":"UA","name":"Ukraine"},{"code":"UZ","name":"Uzbekistan"},{"code":"UY","name":"Uruguay"},{"code":"EC","name":"Ecuador"},{"code":"EG","name":"Egypt"},{"code":"EE","name":"Estonia"},{"code":"ET","name":"Ethiopia"},{"code":"ER","name":"Eritrea"},{"code":"SV","name":"El Salvador"},{"code":"AU","name":"Australia"},{"code":"AT","name":"Austria"},{"code":"AX","name":"Åland Islands"},{"code":"OM","name":"Oman"},{"code":"NL","name":"Netherlands"},{"code":"AN","name":"Netherlands Antilles"},{"code":"GH","name":"Ghana"},{"code":"GG","name":"Guernsey"},{"code":"GY","name":"Guyana"},{"code":"KZ","name":"Kazakhstan"},{"code":"QA","name":"Qatar"},{"code":"CA","name":"Canada"},{"code":"CV","name":"Cape Verde"},{"code":"GA","name":"Gabon"},{"code":"CM","name":"Cameroon"},{"code":"GM","name":"Gambia"},{"code":"KH","name":"Cambodia"},{"code":"MP","name":"Northern Mariana Islands"},{"code":"GN","name":"Guinea"},{"code":"GW","name":"Guinea-Bissau"},{"code":"CY","name":"Cyprus"},{"code":"CU","name":"Cuba"},{"code":"GR","name":"Greece"},{"code":"KI","name":"Kiribati"},{"code":"KG","name":"Kyrgyzstan"},{"code":"GT","name":"Guatemala"},{"code":"GP","name":"Guadeloupe"},{"code":"GU","name":"Guam"},{"code":"KW","name":"Kuwait"},{"code":"CK","name":"Cook Islands"},{"code":"GL","name":"Greenland"},{"code":"CX","name":"Christmas Island"},{"code":"GE","name":"Georgia"},{"code":"GD","name":"Grenada"},{"code":"HR","name":"Croatia"},{"code":"KY","name":"Cayman Islands"},{"code":"KE","name":"Kenya"},{"code":"CI","name":"Côte d'Ivoire"},{"code":"CC","name":"Cocos (Keeling) Islands"},{"code":"CR","name":"Costa Rica"},{"code":"KM","name":"Comoros"},{"code":"CO","name":"Colombia"},{"code":"CG","name":"Congo"},{"code":"CD","name":"Congo, the Democratic Republic of the"},{"code":"SA","name":"Saudi Arabia"},{"code":"WS","name":"Samoa"},{"code":"ST","name":"Sao Tome and Principe"},{"code":"BL","name":"Saint Barthélemy"},{"code":"ZM","name":"Zambia"},{"code":"PM","name":"Saint Pierre and Miquelon"},{"code":"SM","name":"San Marino"},{"code":"MF","name":"Saint Martin (French part)"},{"code":"SL","name":"Sierra Leone"},{"code":"DJ","name":"Djibouti"},{"code":"GI","name":"Gibraltar"},{"code":"JE","name":"Jersey"},{"code":"JM","name":"Jamaica"},{"code":"SY","name":"Syrian Arab Republic"},{"code":"SG","name":"Singapore"},{"code":"ZW","name":"Zimbabwe"},{"code":"CH","name":"Switzerland"},{"code":"SE","name":"Sweden"},{"code":"SD","name":"Sudan"},{"code":"SJ","name":"Svalbard and Jan Mayen"},{"code":"ES","name":"Spain"},{"code":"SR","name":"Suriname"},{"code":"LK","name":"Sri Lanka"},{"code":"SK","name":"Slovakia"},{"code":"SI","name":"Slovenia"},{"code":"SZ","name":"Swaziland"},{"code":"SC","name":"Seychelles"},{"code":"GQ","name":"Equatorial Guinea"},{"code":"SN","name":"Senegal"},{"code":"RS","name":"Serbia"},{"code":"KN","name":"Saint Kitts and Nevis"},{"code":"VC","name":"Saint Vincent and the Grenadines"},{"code":"SH","name":"Saint Helena"},{"code":"LC","name":"Saint Lucia"},{"code":"SO","name":"Somalia"},{"code":"SB","name":"Solomon Islands"},{"code":"TC","name":"Turks and Caicos Islands"},{"code":"TH","name":"Thailand"},{"code":"KR","name":"Korea, Republic of"},{"code":"TW","name":"Taiwan"},{"code":"TJ","name":"Tajikistan"},{"code":"TZ","name":"Tanzania, United Republic of"},{"code":"CZ","name":"Czech Republic"},{"code":"TD","name":"Chad"},{"code":"CF","name":"Central African Republic"},{"code":"CN","name":"China"},{"code":"TN","name":"Tunisia"},{"code":"KP","name":"Korea, Democratic People's Republic of"},{"code":"CL","name":"Chile"},{"code":"TV","name":"Tuvalu"},{"code":"DK","name":"Denmark"},{"code":"DE","name":"Germany"},{"code":"TG","name":"Togo"},{"code":"TK","name":"Tokelau"},{"code":"DO","name":"Dominican Republic"},{"code":"DM","name":"Dominica"},{"code":"TT","name":"Trinidad and Tobago"},{"code":"TM","name":"Turkmenistan"},{"code":"TR","name":"Turkey"},{"code":"TO","name":"Tonga"},{"code":"NG","name":"Nigeria"},{"code":"NR","name":"Nauru"},{"code":"NA","name":"Namibia"},{"code":"AQ","name":"Antarctica"},{"code":"NU","name":"Niue"},{"code":"NI","name":"Nicaragua"},{"code":"NE","name":"Niger"},{"code":"EH","name":"Western Sahara"},{"code":"NC","name":"New Caledonia"},{"code":"NZ","name":"New Zealand"},{"code":"NP","name":"Nepal"},{"code":"NF","name":"Norfolk Island"},{"code":"NO","name":"Norway"},{"code":"BH","name":"Bahrain"},{"code":"HT","name":"Haiti"},{"code":"PK","name":"Pakistan"},{"code":"VA","name":"Holy See (Vatican City State)"},{"code":"PA","name":"Panama"},{"code":"VU","name":"Vanuatu"},{"code":"BS","name":"Bahamas"},{"code":"PG","name":"Papua New Guinea"},{"code":"BM","name":"Bermuda"},{"code":"PW","name":"Palau"},{"code":"PY","name":"Paraguay"},{"code":"BB","name":"Barbados"},{"code":"PS","name":"Palestinian Territory, Occupied"},{"code":"HU","name":"Hungary"},{"code":"BD","name":"Bangladesh"},{"code":"TL","name":"Timor-Leste"},{"code":"PN","name":"Pitcairn"},{"code":"FJ","name":"Fiji"},{"code":"PH","name":"Philippines"},{"code":"FI","name":"Finland"},{"code":"BT","name":"Bhutan"},{"code":"BV","name":"Bouvet Island"},{"code":"PR","name":"Puerto Rico"},{"code":"FO","name":"Faroe Islands"},{"code":"FK","name":"Falkland Islands (Malvinas)"},{"code":"BR","name":"Brazil"},{"code":"FR","name":"France"},{"code":"GF","name":"French Guiana"},{"code":"PF","name":"French Polynesia"},{"code":"TF","name":"French Southern Territories"},{"code":"BG","name":"Bulgaria"},{"code":"BF","name":"Burkina Faso"},{"code":"BN","name":"Brunei Darussalam"},{"code":"BI","name":"Burundi"},{"code":"HM","name":"Heard Island and McDonald Islands"},{"code":"VN","name":"Viet Nam"},{"code":"BJ","name":"Benin"},{"code":"VE","name":"Venezuela"},{"code":"BY","name":"Belarus"},{"code":"BZ","name":"Belize"},{"code":"PE","name":"Peru"},{"code":"BE","name":"Belgium"},{"code":"PL","name":"Poland"},{"code":"BA","name":"Bosnia and Herzegovina"},{"code":"BW","name":"Botswana"},{"code":"BO","name":"Bolivia"},{"code":"PT","name":"Portugal"},{"code":"HK","name":"Hong Kong"},{"code":"HN","name":"Honduras"},{"code":"MH","name":"Marshall Islands"},{"code":"MO","name":"Macao"},{"code":"MK","name":"Macedonia, the former Yugoslav Republic of"},{"code":"MG","name":"Madagascar"},{"code":"YT","name":"Mayotte"},{"code":"MW","name":"Malawi"},{"code":"ML","name":"Mali"},{"code":"MT","name":"Malta"},{"code":"MQ","name":"Martinique"},{"code":"MY","name":"Malaysia"},{"code":"IM","name":"Isle of Man"},{"code":"FM","name":"Micronesia, Federated States of"},{"code":"ZA","name":"South Africa"},{"code":"GS","name":"South Georgia and the South Sandwich Islands"},{"code":"MM","name":"Myanmar"},{"code":"MX","name":"Mexico"},{"code":"MU","name":"Mauritius"},{"code":"MR","name":"Mauritania"},{"code":"MZ","name":"Mozambique"},{"code":"MC","name":"Monaco"},{"code":"MV","name":"Maldives"},{"code":"MD","name":"Moldova, Republic of"},{"code":"MA","name":"Morocco"},{"code":"MN","name":"Mongolia"},{"code":"ME","name":"Montenegro"},{"code":"MS","name":"Montserrat"},{"code":"JO","name":"Jordan"},{"code":"LA","name":"Lao People's Democratic Republic"},{"code":"LV","name":"Latvia"},{"code":"LT","name":"Lithuania"},{"code":"LY","name":"Libyan Arab Jamahiriya"},{"code":"LI","name":"Liechtenstein"},{"code":"LR","name":"Liberia"},{"code":"RO","name":"Romania"},{"code":"LU","name":"Luxembourg"},{"code":"RW","name":"Rwanda"},{"code":"LS","name":"Lesotho"},{"code":"LB","name":"Lebanon"},{"code":"RE","name":"Réunion"},{"code":"RU","name":"Russian Federation"},{"code":"WF","name":"Wallis and Futuna"}],"jobs":[{"id":1,"name":"IT关联"},{"id":2,"name":"事务关联"},{"id":3,"name":"技术关联"},{"id":4,"name":"营业/企划关联"},{"id":5,"name":"创作关联"},{"id":6,"name":"贩卖关联"},{"id":7,"name":"服务关联"},{"id":8,"name":"短衣帮"},{"id":9,"name":"高管/行政管理"},{"id":10,"name":"专门职业"},{"id":11,"name":"公务员"},{"id":12,"name":"教师"},{"id":13,"name":"自雇"},{"id":14,"name":"艺术家"},{"id":15,"name":"飛特族"},{"id":16,"name":"小学生"},{"id":17,"name":"中学生"},{"id":18,"name":"高校生"},{"id":19,"name":"大学生/研究生"},{"id":20,"name":"学院生"},{"id":21,"name":"家庭主妇"},{"id":22,"name":"求职中"},{"id":23,"name":"其他"}],"default_profile_image_urls":{"medium":"https://s.pximg.net/common/images/no_profile.png"}}
     */

    private ProfilePresetsBean profile_presets;

    public ProfilePresetsBean getProfile_presets() {
        return profile_presets;
    }

    public void setProfile_presets(ProfilePresetsBean profile_presets) {
        this.profile_presets = profile_presets;
    }
}