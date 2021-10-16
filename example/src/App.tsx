import * as React from 'react';

import { StyleSheet, View, Text, Button } from 'react-native';
import NpmLibrary from 'react-native-npm-library';

export default function App() {
  const [result, setResult] = React.useState<number | undefined>();

  React.useEffect(() => {
    NpmLibrary.multiply(3, 7).then(setResult);
  }, []);

  return (
    <View style={styles.container}>
      <Text>Result: {result}</Text>
      <Button
        title="Show Toast"
        onPress={() => NpmLibrary.showToast("Hi This is a Native Toast!")} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
