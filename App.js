/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import ReactNative from 'react-native'
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  Button,
  StatusBar,
} from 'react-native';

import {
  Header,
  LearnMoreLinks,
  Colors,
  DebugInstructions,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';
const { BotConnectionModule } = ReactNative.NativeModules;


const App: () => React$Node = () => {


  return (
    <>
      <StatusBar barStyle="dark-content" />
      <View style={styles.ViewSection}>
      <Button
        style={styles.BotButton}
        title="Connect To Bot from React Native"
        onPress={() => BotConnectionModule.show()}
      />
      </View>
    </>
  );
};

function generateQuickGuid() {
  return Math.random().toString(36).substring(2, 15) +
      Math.random().toString(36).substring(2, 15);
}

const styles = StyleSheet.create({
  scrollView: {
    backgroundColor: Colors.lighter,
  },
   footer: {
    color: Colors.dark,
    fontSize: 12,
    fontWeight: '600',
    padding: 4,
    paddingRight: 12,
    textAlign: 'right',
  },
  ViewSection: {
    width: '100%',
    height: '100%',
    justifyContent: 'center',
    alignItems: 'center'
 },
 BotButton: {
  fontSize: 40,
  fontWeight: '400',
  width: '100%',
  height: '30%',
  backgroundColor: '#9c1d26',
  color: 'white'
}
});

export default App;
